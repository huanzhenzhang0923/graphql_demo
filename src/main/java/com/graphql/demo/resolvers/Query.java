package com.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.models.SuperCharacter;
import com.graphql.demo.repos.SuperCharacterRepo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {
    private SuperCharacterRepo superCharacterRepo;

    public Query(SuperCharacterRepo repo) {
        this.superCharacterRepo=repo;
    }

    public List<SuperCharacter> characters(){
        return superCharacterRepo.getCharacters();
    }

    public SuperCharacter characterById(String id) {
        return superCharacterRepo.getCharacterById(id);
    }

}
