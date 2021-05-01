package com.robcodes.graphqlprimer.config;

import com.robcodes.graphqlprimer.mutation.Mutation;
import com.robcodes.graphqlprimer.query.Query;
import com.robcodes.graphqlprimer.repository.AuthorRepository;
import com.robcodes.graphqlprimer.repository.PostRepository;
import com.robcodes.graphqlprimer.resolver.AuthorResolver;
import com.robcodes.graphqlprimer.resolver.PostResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

    @Autowired
    PostRepository postRepository;

    @Autowired
    AuthorRepository authorRepository;


    @Bean
    public PostResolver postResolver(PostRepository postRepository) {
        return new PostResolver(postRepository);
    }

    @Bean
    public AuthorResolver authorResolver(AuthorRepository authorRepository) {
        return new AuthorResolver(authorRepository);
    }

    @Bean
    public Query query(PostRepository postRepository) {
        return new Query(postRepository);
    }

    @Bean
    public Mutation mutation(PostRepository postRepository) {
        return new Mutation(postRepository);
    }
}