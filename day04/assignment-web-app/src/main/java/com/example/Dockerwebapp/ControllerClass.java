package com.example.Dockerwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerClass {


        @GetMapping("/age")
        public int age()
        {
            return 10;
        }

        @GetMapping("/name")
        public String name()
        {
            return "Rasmi";
        }

        @GetMapping("/address")
        public String address()
        {
            return "Hyderabad";
        }

    }


