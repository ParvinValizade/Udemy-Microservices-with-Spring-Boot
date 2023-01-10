package com.company.springbootrestful.controller;

import com.company.springbootrestful.model.SomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/filtering")
public class FilteringController {

   @GetMapping
    public SomeBean filtering(){
        return new SomeBean("value1","value2","value3","value4");
    }

    @GetMapping("/list")
    public List<SomeBean> filteringList(){
       return Arrays.asList(new SomeBean("value1","value2","value3","value4"),new SomeBean("value1","value2","value3","value4"));
    }


}
