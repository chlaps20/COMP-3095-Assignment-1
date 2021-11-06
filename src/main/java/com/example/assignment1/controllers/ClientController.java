package com.example.assignment1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/clients")
@Controller
public class ClientController {

    @RequestMapping({"","/","/index.html","/index"})
    public String listClient(){
        return "clients/index";
    }

}
