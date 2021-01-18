package com.learinglearning;

import com.learinglearning.web.WebController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class WebControllerTest {
    @Test
    public void getUser() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andReturn().getResponse().getContentAsString();
        System.out.println("result" + responseString);
    }

    @Test
    public void getUsers() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
        String responseString = mockMvc.perform(MockMvcRequestBuilders.get("/getUsers"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result" + responseString);
    }

    @Test
    public void saveUsers() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/saveUser")
                .param("name", "")
                .param("age", "666")
                .param("pass", "test")
        );
    }


}
