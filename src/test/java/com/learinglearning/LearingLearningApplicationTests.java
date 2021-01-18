package com.learinglearning;

import com.learinglearning.web.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
class LearingLearningApplicationTests {

    @Test
    void contextLoads() {
    }

    private MockMvc mockMvc;
    @BeforeTestClass
    void setUp(){

    }
    @Test
    void getUser() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/helo?name=小明").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }
    @Test
    void getUsers() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/getUsers").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }




}
