package com.example.rasmisecurityass.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/getstudent")
    public String getStudent()
    {
        return "Student";
    }

    @PutMapping("/updatestudent")
    public String update()
    {
        return "updated";
    }

    @DeleteMapping("/deletestudent")
    public String delete()
    {
        return "deleted";
    }


}
