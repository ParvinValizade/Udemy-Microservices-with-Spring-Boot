package com.company.springbootrestful.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties({"field1","field4"})
public class SomeBean {
    private String field1;

    @JsonIgnore
    private String field2;
    private String field3;

    private String field4;
}
