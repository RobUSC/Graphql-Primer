package com.robcodes.graphqlprimer.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.robcodes.graphqlprimer.entity.Post;
import com.robcodes.graphqlprimer.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    final PostRepository postRepository;

    public Page<Post> getRecentPosts(int count, int offset) {
        return postRepository.findAll(PageRequest.of(count, offset));
    }
}