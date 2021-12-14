package com.Spring.Blog.Controllers;


import com.Spring.Blog.Models.Comment;
import com.Spring.Blog.Models.Post;
import com.Spring.Blog.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping("/comments/all")
    public List<Comment> getAllComments(){
        return commentService.getComments();
    }


    @RequestMapping("/posts/{postId}/comments")
    public List<Comment> getCommentsByPostId(@PathVariable Long postId){
        return commentService.getCommentsByPostId(postId);
    }


    @RequestMapping("/user/{userId}/comments")
    public List<Comment> getCommentsByUserId(@PathVariable Long userId){
        return commentService.getCommentsByUserId(userId);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/posts/{postId}/comment/add")
    public void addComment(@RequestBody Comment comment, @PathVariable Long postId){
        comment.setPost(new Post(postId));
        comment.setTimestamp(getTimestamp());
        commentService.addComment(comment);
    }





    private Timestamp getTimestamp(){
        Date date = new Date();
        return new Timestamp(date.getTime());
    }


}
