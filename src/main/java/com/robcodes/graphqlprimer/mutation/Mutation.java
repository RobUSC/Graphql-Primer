package com.robcodes.graphqlprimer.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.robcodes.graphqlprimer.entity.Post;
import com.robcodes.graphqlprimer.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private PostRepository postRepository;

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(new Random().nextLong());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postRepository.save(post);

        return post;
    }
}