package com.company.springbootrestful.controller;

import com.company.springbootrestful.model.SomeBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/filtering")
public class FilteringController {

//   @GetMapping("/static")
//    public SomeBean filtering(){
//        return new SomeBean("value1","value2","value3","value4");
//    }

    @GetMapping("/list")
    public MappingJacksonValue filteringList(){
        List<SomeBean> someBeans = Arrays.asList(new SomeBean("value1", "value2", "value3", "value4"),
                new SomeBean("value1", "value2", "value3", "value4"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBeans);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field4");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @GetMapping("dynamic")
    public MappingJacksonValue dynamicFiltering(){
       SomeBean someBean = new SomeBean("value1","value2","value3","value4");

       MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);

        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }


}
