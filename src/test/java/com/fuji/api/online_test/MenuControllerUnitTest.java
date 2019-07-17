package com.fuji.api.online_test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fuji.api.online_test.repository.UserRepository;

@RunWith(SpringRunner.class)
@WebMvcTest
public class MenuControllerUnitTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	UserRepository userRepository;
	
	
	@Test
	public MockHttpServletResponse contextLoads() throws Exception{
		
		when(userRepository.findGroupIdByUserId("u001")).thenReturn(1);
		
		MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("category/category-by-userid/u001")
				.accept(MediaType.APPLICATION_JSON)
		).andReturn();
		System.out.println(mvcResult.getResponse());
		verify(userRepository).findGroupIdByUserId("u001");
		return mvcResult.getResponse();
				
	}
}
