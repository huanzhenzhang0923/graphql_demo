package com.graphql.demo.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@Getter
public class SuperGroup {
    private String name;
    private Orientation orientation;
    private List<SuperCharacter> members;

    public void addCharacter(SuperCharacter character) {
        if (members==null) {
            members= new ArrayList<>();
        }
        if (character!=null) members.add(character);
    }

    public void removeCharacter(SuperCharacter character) {
        this.members=this.members.stream().filter(c->!c.getName().equalsIgnoreCase(character.getName())).collect(Collectors.toList());
    }
}
