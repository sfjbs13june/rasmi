package com.example.rasmiwebmicroservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/get")
    public String getData()
    {
        return "get The data";
    }

    @PostMapping("/save")
    public String saveData()
    {
        return "saved the data";
    }

    @PutMapping("/update")
    public String updateData()
    {
        return "Updated the data";
    }

    @DeleteMapping("/delete")
    public String deleteData()
    {
        return "deleted the data";
    }
}
