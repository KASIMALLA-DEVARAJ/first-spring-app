package com.ourfirstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller - It is a class & it contains APIs. It is the entry point/Starting point where our req first comes to.
//@ResponseBody  - sends the response back to the user.
@RestController
@RequestMapping("/demo/apis")  //it maps the input comping from frontend to this controller class.
public class DemoController {

    //this is our first API
    @GetMapping("/demo1")
    public String getDemo1(){
        return "First Spring app API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        return "Second Spring API";
    }
}
