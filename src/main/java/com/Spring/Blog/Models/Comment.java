package com.Spring.Blog.Models;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Timestamp timestamp; // test that

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;


    public Comment() {
    }

    public Comment(Long id, String content, Post post, User user) {
        this.id = id;
        this.content = content;
        this.post = post;
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
