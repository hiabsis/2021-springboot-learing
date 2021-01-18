package com.learinglearning.web;

import com.learinglearning.model.NeoProperties;
import com.learinglearning.model.OtherProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    public NeoProperties properties ;
    @Resource
    private OtherProperties otherProperties;
    @GetMapping ("/hello")
    public String hello(){
        return "hello+333"+ properties+"  \n"+otherProperties;
    }


}
