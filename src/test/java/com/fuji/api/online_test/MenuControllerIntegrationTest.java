package com.fuji.api.online_test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import com.fuji.api.online_test.model.Category;
import com.fuji.api.online_test.model.User;
import com.fuji.api.online_test.repository.CategoryRepository;
import com.fuji.api.online_test.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Mock
	private UserRepository userRepository;
	
	@Mock
	private CategoryRepository categoryRepository;

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
		User user = restTemplate.getForObject(getRootUrl() + "category/category-by-userid/u001", User.class);
		System.out.println("This is User Name : " + user.getName());
		System.out.println("This is User GroupId : " + user.getGroupId());
	}

	
	@Test
	public void whenFindById_it_return_groupId(){
		Category category = new Category();
		User user = new User();
		user.setUserId("u001");
		when(userRepository.findGroupIdByUserId("u001")).thenReturn(category.getGroupId());
		
		Optional<User> getGroupIdByUserId = userRepository.findById("u001");
		
		assertEquals(getGroupIdByUserId, category.getGroupId());
	}
}
