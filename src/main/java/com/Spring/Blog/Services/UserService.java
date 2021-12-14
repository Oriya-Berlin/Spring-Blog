package com.Spring.Blog.Services;

import com.Spring.Blog.Models.User;
import com.Spring.Blog.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    //
    public List<User> getUsers(){
        return userRepository.findAll();
    }


    public User getUserByUserId(Long id){
        return userRepository.getById(id);
    }


    public void addUser(User user){
        userRepository.save(user);
    }


    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


    public void updateUserDetails(User user){
        userRepository.save(user);
    }




}
