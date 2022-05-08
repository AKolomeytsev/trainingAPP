package ru.taxi.taxiapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("regionAPP")
public class RegionControllerSPA {
    @GetMapping("")
    public String index(){
        return "regionIndex";
    }
}
