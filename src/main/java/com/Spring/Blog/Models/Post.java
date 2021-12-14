package com.Spring.Blog.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private User user;

    public Post(Long id) {
        this.id = id;
    }

    public Post() {
    }

    public Post(Long id,String title, String content, Date date, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
