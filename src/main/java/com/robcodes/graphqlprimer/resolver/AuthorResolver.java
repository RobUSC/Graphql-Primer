package com.robcodes.graphqlprimer.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.robcodes.graphqlprimer.entity.Author;
import com.robcodes.graphqlprimer.repository.AuthorRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    final AuthorRepository authorRepository;

    public Author getAuthor(Author author) {
        return authorRepository.findById(author.getId()).orElse(new Author());
    }
}