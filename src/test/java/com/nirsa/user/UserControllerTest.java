package com.nirsa.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.nirsa.user.dto.UserDTO;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class UserControllerTest extends AbstractTest{

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

	@Test
	public void addUser() throws Exception {
		String uri = "/user/add";
		UserDTO userDTO = UserDTO.builder()
            .name("Carlos Julio Pérez Quizhpe")
            .password("abc123")
            .build();

		String inputJson = super.mapToJson(userDTO);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
	}
    
}