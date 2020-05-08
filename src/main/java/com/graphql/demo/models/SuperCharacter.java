package com.graphql.demo.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class SuperCharacter {
    private String id;
    private String name;
    private Integer age;
    private SuperGroup group;
}
