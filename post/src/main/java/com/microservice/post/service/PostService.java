package com.microservice.post.service;

import com.microservice.post.entity.post;
import com.microservice.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;



    public post savePost(post post) {
        String postId = UUID.randomUUID().toString();
        post.setId(postId);
        post savepost = postRepository.save(post);
     return savepost;
    }
    public post findPostById(String postId) {
        post post = postRepository.findById(postId).get();
        return post;
    }

}
