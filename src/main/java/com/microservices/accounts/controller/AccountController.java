package com.microservices.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "api/v1/", produces = {})
public class AccountController {


    @GetMapping(path = "hi")
    public String sayHello(){

        return "Hello MFs";
    }
}
