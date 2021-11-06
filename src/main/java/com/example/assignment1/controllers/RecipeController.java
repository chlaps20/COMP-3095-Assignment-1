package com.example.assignment1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/recipes")
@Controller
public class RecipeController {

    @RequestMapping({"","/","index.html","index"})
    public String index(){
        return "recipes/index";
    }
}
