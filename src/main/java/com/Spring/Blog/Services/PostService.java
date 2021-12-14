package com.Spring.Blog.Services;


import com.Spring.Blog.Models.Post;
import com.Spring.Blog.Models.User;
import com.Spring.Blog.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    PostRepository postRepository;


    public List<Post> getPosts(){
        return postRepository.findAll();
    }


    public Optional<Post> getPostByPostId(Long id){
        return postRepository.findById(id);
    }


    public void addPost(Post post){
        postRepository.save(post);
    }


    public List<Post> getPostsByUserId(Long id){
        return postRepository.findByUserId(id);
    }


    public void deletePostById(Long id){
        postRepository.deleteById(id);
    }



}
