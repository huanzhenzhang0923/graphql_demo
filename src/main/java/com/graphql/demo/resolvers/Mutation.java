package com.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.models.SuperCharacter;
import com.graphql.demo.repos.SuperCharacterRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;

    public Mutation(SuperCharacterRepo characterRepo) {
        this.characterRepo = characterRepo;
    }

    public SuperCharacter addCharacter(String name, Integer age) {
        return characterRepo.addCharacter(name, age);
    }
}
