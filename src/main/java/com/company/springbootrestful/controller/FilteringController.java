package com.company.springbootrestful.controller;

import com.company.springbootrestful.model.SomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/filtering")
public class FilteringController {

   @GetMapping
    private SomeBean filtering(){
        return new SomeBean("value1","value2","value3","value4");
    }
}
