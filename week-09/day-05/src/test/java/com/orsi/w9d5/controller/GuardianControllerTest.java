package com.orsi.w9d5.controller;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
class GuardianControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype());


    @Autowired
    private MockMvc mockMvc;

    @Test
    void groot_TestWithMessage() throws Exception {
        this.mockMvc
                .perform(get("/groot")
                        .param("message", "something")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.message", is("something")))
                .andExpect(jsonPath("$.translated", is("I am Groot.")));
    }

    @Test
    void groot_TestWithoutMessage() throws Exception {
        this.mockMvc
                .perform(get("/groot")
                        .param("message", "")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am groot hiba")));

    }

    @Test
    void groot_TestNullMessage() throws Exception {
        this.mockMvc
                .perform(get("/groot")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am groot hiba")));

    }

    @Test
    void yonduArrowSpeedParamsOk() throws Exception {
        this.mockMvc
                .perform(get("/yondu")
                        .param("distance", "100.0")
                        .param("time", "10.0")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.distance", is(100.0)))
                .andExpect(jsonPath("$.time", is(10.0)))
                .andExpect(jsonPath("$.speed", is(10.0)))
                .andExpect(status().isOk());
    }

    @Test
    void yonduArrowSpeedWithoutParams() throws Exception {
        this.mockMvc
                .perform(get("/yondu")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("time and distance is needed")))
                .andExpect(status().isBadRequest());
    }

}