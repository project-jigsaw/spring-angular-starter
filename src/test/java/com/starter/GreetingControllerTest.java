package com.starter;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testExampleDefault() throws Exception {
        this.mockMvc.perform(get("/greeting").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"id\":667,\"content\":\"Hello, World!\"}"));
    }

    @Test
    public void testExampleWithParameter() throws Exception {
        this.mockMvc.perform(get("/greeting?name=Mikey").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"id\":666,\"content\":\"Hello, Mikey!\"}"));
    }

    @Test
    public void testExampleWithParameterUsingGson() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(get("/greeting?name=Mikey")
                .accept(MediaType.ALL))
                .andReturn();

        String responseContent = mvcResult.getResponse().getContentAsString();
        Gson gson = new Gson();
        Greeting returnedGreeting = gson.fromJson(responseContent, Greeting.class);

        assertThat(returnedGreeting.getId()).isEqualTo(666);
        assertThat(returnedGreeting.getContent()).isEqualTo("Hello, Mikey!");
    }
}
