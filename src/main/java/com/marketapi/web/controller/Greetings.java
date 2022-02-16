package com.marketapi.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class Greetings {
    @GetMapping("/hola")
    public String Message(){
        return "Hello World";
    }
    @GetMapping("/adios")
    public String MessageII(){
        return "Good Bye World";
    }
}
