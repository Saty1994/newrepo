package com.microservice.post.repository;

import com.microservice.post.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<post, String> {
}
