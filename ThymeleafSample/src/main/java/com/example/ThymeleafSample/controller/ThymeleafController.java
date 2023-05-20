package com.example.ThymeleafSample.controller;

import com.example.ThymeleafSample.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ThymeleafController {

    @GetMapping("a")
    public String paA(Model model){
        return"pageA";
    }
    @GetMapping("show")
    public String showView(Model model){
        model.addAttribute("name","리슌신");

        List<String> list = new ArrayList<>();

        Map<String, Member> memberMap = new HashMap<String,Member>();


        return "useTime";
    }
}
