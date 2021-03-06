package com.Spring.Blog.Repositories;

import com.Spring.Blog.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByUserId(Long userId);

    Optional<Post> findById(Long id);
}
