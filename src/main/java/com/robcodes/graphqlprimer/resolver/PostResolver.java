package com.robcodes.graphqlprimer.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.robcodes.graphqlprimer.entity.Post;
import com.robcodes.graphqlprimer.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;

@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private PostRepository postRepository;

    public Post getPost(Post post) {
        return postRepository.findOne(Example.of(post)).orElse(new Post());
    }
}
