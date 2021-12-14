package com.Spring.Blog.Controllers;



import com.Spring.Blog.Models.User;
import com.Spring.Blog.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {


    @Autowired
    UserService userService;


    // Get all users
    @RequestMapping("/users/all")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }


    // Create new user
    @RequestMapping(method = RequestMethod.POST, value = "/users/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
