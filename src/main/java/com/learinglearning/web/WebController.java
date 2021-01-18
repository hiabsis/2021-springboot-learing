package com.learinglearning.web;

import com.learinglearning.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Binding;
import java.util.LinkedList;
import java.util.List;

@RestController
public class WebController {
    @PostMapping( "/getUser")
    public User getUser(){
        User user = new User();
        user.setName("小明"+"  s ");
        user.setAge(12);
        return user;
    }
    @GetMapping("/getUsers")
    public List<User> getList(){
        List<User> users = new LinkedList<>();
        User user = new User();
        user.setName("小明"+"  s ");
        user.setAge(12);
        users.add(user);

        user.setName("小明"+"  s22 ");
        user.setAge(12);
        users.add(user);
        return users;
    }

    @GetMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result){
        System.out.println("user: " + user);
        if (result.hasErrors()){
            List<ObjectError> list  = result.getAllErrors();
            for (ObjectError error:list){
                System.out.println(error.getCode()+" - " +error.getDefaultMessage());
            }
        }

    }
}
