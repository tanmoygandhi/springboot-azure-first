package com.azure.first.springbootazurefirst.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureFirstController {

    @GetMapping("/azure")
    public String sayHello() {
        return "Welcome!  this is your first Application on Azure Cloud !!!";
    }
}
