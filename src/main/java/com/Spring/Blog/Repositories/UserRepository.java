package com.Spring.Blog.Repositories;

import com.Spring.Blog.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
