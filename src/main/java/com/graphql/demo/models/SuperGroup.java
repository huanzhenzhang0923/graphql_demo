package com.graphql.demo.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Builder
@Getter
public class SuperGroup {
    private String name;
    private Orientation orientation;
    private List<SuperCharacter> members;

}
