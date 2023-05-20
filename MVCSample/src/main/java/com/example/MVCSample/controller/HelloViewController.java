package com.example.MVCSample.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloViewController {

    @GetMapping("view")
    public String hello(Model model){
        model.addAttribute("a","히히안뇽!");
        return "hello";
    }
    @GetMapping("a")
    @ResponseBody
    public ResponseEntity<String> asd() {
        String a = "힛";
        return ResponseEntity.ok(a);
    }
}
