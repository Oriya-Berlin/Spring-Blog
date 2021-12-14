package com.Spring.Blog.Controllers;



import com.Spring.Blog.Models.Post;
import com.Spring.Blog.Models.User;
import com.Spring.Blog.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
public class PostController {


    @Autowired
    PostService postService;


    // Get all posts
    @RequestMapping("/posts/all")
    public List<Post> getAllAliens(){
        return postService.getPosts();
    }


    // Create new post
    @RequestMapping(method = RequestMethod.POST, value = "/posts/add")
    public void addPost(@RequestBody Post post){
        post.setDate(new Date());
        post.setUser(new User(post.getUser().getId()));
        postService.addPost(post);
    }


    // Get posts by user id
    @RequestMapping("/users/{userId}/posts")
    public List<Post> getPostsByUserId(@PathVariable Long userId){
        return postService.getPostsByUserId(userId);
    }


    // Get post by post id
    @RequestMapping("/posts/{postId}")
    public Optional<Post> getPostsByPostId(@PathVariable Long postId){
        return postService.getPostByPostId(postId);
    }


    // Update post
    @RequestMapping(method = RequestMethod.PUT, value = "/posts/update/{postId}")
    public void updatePost(@PathVariable Long postId, @RequestBody Post post){
        post.setDate(new Date());
        postService.addPost(post);
    }


    // Delete post
    @RequestMapping(method = RequestMethod.DELETE, value = "/posts/delete/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.deletePostById(postId);
    }


}
