package com.graphql.demo;

import com.graphql.demo.repos.SuperCharacterRepo;
import com.graphql.demo.resolvers.Mutation;
import com.graphql.demo.resolvers.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlDemoApplication {
	@Autowired
	SuperCharacterRepo superCharacterRepo;


	@Bean
	public Query query(){
		return new Query(superCharacterRepo);
	}

	@Bean
	public Mutation mutation(){
		return new Mutation(superCharacterRepo);
	}

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

}
