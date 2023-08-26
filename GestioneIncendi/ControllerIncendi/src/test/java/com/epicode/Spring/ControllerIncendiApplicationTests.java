package com.epicode.Spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerIncendiApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	 void testControlSonde() throws Exception {
        mockMvc.perform(get("/alarm")
                .param("idsonda", "1")
                .param("lat", "25.12345")
                .param("lon", "45.67890")
                .param("smokelevel", "6"))
                .andExpect(status().isOk())
                .andExpect(content().string("Allarme!"));
    }

	@Test
	void testControlSondeBasse() throws Exception {
		mockMvc.perform(get("/alarm")
				.param("idsonda", "1")
				.param("lat", "25.12345")
				.param("lon", "45.67890")
				.param("smokelevel", "3"))
		.andExpect(status().isOk())
		.andExpect(content().string("Allarme!"));
	}
	
}
