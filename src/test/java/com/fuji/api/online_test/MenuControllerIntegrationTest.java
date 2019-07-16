package com.fuji.api.online_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.fuji.api.online_test.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}
	
	@Test
    public void contextLoads() {

    }
	
	@Test
	public void testGetAllCategoryByUserId() {
		User user = restTemplate.getForObject(getRootUrl() + "/category-by-userid/u001", User.class);
		System.out.println("This is User Name : "+user.getName());
		System.out.println("This is User GroupId : "+user.getGroupId());
	}
}
