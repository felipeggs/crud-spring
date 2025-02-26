package com.felipe.crud_spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourcesController {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Object> list(){
        return null;
    }
}
