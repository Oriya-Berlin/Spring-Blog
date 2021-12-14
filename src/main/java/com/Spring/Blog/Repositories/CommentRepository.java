package com.Spring.Blog.Repositories;

import com.Spring.Blog.Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findCommentByPostId(Long postId);

    List<Comment> findCommentByUserId(Long userId);

}
