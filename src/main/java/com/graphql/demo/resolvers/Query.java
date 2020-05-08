package com.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.models.SuperCharacter;
import com.graphql.demo.models.SuperGroup;
import com.graphql.demo.repos.SuperCharacterRepo;
import com.graphql.demo.repos.SuperGroupRepo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {
    private SuperCharacterRepo superCharacterRepo;
    private SuperGroupRepo superGroupRepo;

    public Query(SuperCharacterRepo repo, SuperGroupRepo grepo) {
        this.superCharacterRepo=repo;
        this.superGroupRepo=grepo;
    }

    public List<SuperCharacter> characters(){
        return superCharacterRepo.getCharacters();
    }

    public SuperCharacter characterById(String id) {
        return superCharacterRepo.getCharacterById(id);
    }

    public List<SuperGroup> groups() {
        return superGroupRepo.getGroups();
    }

    public SuperGroup groupByName(String name) {
        return superGroupRepo.getGroupByName(name);
    }

}
