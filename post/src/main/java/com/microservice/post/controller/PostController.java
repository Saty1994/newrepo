package com.microservice.post.controller;

import com.microservice.post.entity.post;
import com.microservice.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<post> savePost(@RequestBody post post) {
      post newPost = postService.savePost(post);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }

    @GetMapping("{postId}")
    public post getPostByPostId(@PathVariable String postId){
        post post = postService.findPostById(postId);
        return post;
    }

}
