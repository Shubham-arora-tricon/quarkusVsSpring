package com.triconinfotech.GreetingsSample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ExampleGreetingController {
    @GetMapping
    public String hello(){
        return "hello";
    }

    @GetMapping("/{name}")
    public String GreetingWithName(@PathVariable("name") String name ) {
        return "hello "+name;
    }
}
