package com.provider.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/hello")
    public String sayhello(){
        return "I am provider,hello consumer!";
    }

}
