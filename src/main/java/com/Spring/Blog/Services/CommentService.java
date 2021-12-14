package com.Spring.Blog.Services;


import com.Spring.Blog.Models.Comment;
import com.Spring.Blog.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {


    @Autowired
    CommentRepository commentRepository;


    public List<Comment> getComments(){
        return commentRepository.findAll();
    }


    public Comment getCommentByCommentId(Long id){
        return commentRepository.getById(id);
    }


    public void addComment(Comment comment){
        commentRepository.save(comment);
    }


    public List<Comment> getCommentsByPostId(Long postId){
        return commentRepository.findCommentByPostId(postId);
    }


    public List<Comment> getCommentsByUserId(Long userId){
        return commentRepository.findCommentByUserId(userId);
    }



}
