package com.learinglearning;

import com.learinglearning.model.NeoProperties;
import com.learinglearning.model.OtherProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${neo.title}")
    private String title;
    @Test
    public void test(){
        System.out.println("title "+ title);
//        Assert.assertEquals(title,"纯洁的微笑");
    }
    @Resource
    private NeoProperties neoProperties;
    @Test
    private void testMore(){
        System.out.println("title: " + neoProperties.getTitle() );
        System.out.println("description: "+ neoProperties.getDescription());
    }
    @Resource
    private OtherProperties otherProperties;


    @org.junit.Test
    private void otherTest(){
        System.out.println("title:"+ otherProperties.getTitle());
        System.out.println("blog"+ otherProperties.getBlog());
    }
}
