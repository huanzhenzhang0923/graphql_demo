package com.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.models.Orientation;
import com.graphql.demo.models.SuperCharacter;
import com.graphql.demo.models.SuperGroup;
import com.graphql.demo.repos.SuperCharacterRepo;
import com.graphql.demo.repos.SuperGroupRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;
    private SuperGroupRepo groupRepo;

    public Mutation(SuperCharacterRepo characterRepo,SuperGroupRepo groupRepo) {
        this.characterRepo = characterRepo;
        this.groupRepo=groupRepo;
    }

    public SuperCharacter addCharacter(String name, Integer age) {
        return characterRepo.addCharacter(name, age);
    }

    public SuperGroup addGroup(String name, Orientation orientation) {
        return groupRepo.addGroup(name,orientation);
    }
}
