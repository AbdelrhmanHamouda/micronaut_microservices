package com.nexthink.mnt.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/sayhello")
public class SayHello {

    @Get("/message")
    public String helloMessage() {
        return "Welcome to this Micro-Service";
    }

    @Get("/{name}")
    public String helloName(String name) {
        return "Welcome " + name;
    }
}
