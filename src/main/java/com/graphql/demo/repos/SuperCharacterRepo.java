package com.graphql.demo.repos;

import com.graphql.demo.models.SuperCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class SuperCharacterRepo {
    private List<SuperCharacter> theCharacters = new ArrayList<SuperCharacter>();

    public SuperCharacterRepo(){seedCharacters();}

    private void seedCharacters(){
        SuperCharacter c1=SuperCharacter.builder()
                .id("Char1")
                .name("Super Character1")
                .age(33)
                .build();

        SuperCharacter c2=SuperCharacter.builder()
                .id("Char2")
                .name("Two is My Name")
                .age(36)
                .build();

        this.theCharacters.add(c1);
        this.theCharacters.add(c2);

    }

    public List<SuperCharacter> getCharacters(){
        return this.theCharacters;
    }

    public SuperCharacter getCharacterById(String id) {
        List<SuperCharacter> matched = this.theCharacters.stream()
                .filter(c->c.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList());

        if (matched.size()>0) {
            return matched.get(0);
        }
        else {
            return null;
        }
    }

    public SuperCharacter addCharacter(String name,Integer age) {
        SuperCharacter newChar = SuperCharacter.builder()
                .id("Char"+(this.theCharacters.size()+1))
                .name(name)
                .age(age)
                .build();

        log.info("====> Mutation.addCharacter(" +name+ ")");
        this.theCharacters.add(newChar);
        return newChar;
    }
}
