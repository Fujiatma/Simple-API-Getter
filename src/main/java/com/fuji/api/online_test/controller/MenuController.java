package com.fuji.api.online_test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fuji.api.online_test.model.Category;
import com.fuji.api.online_test.repository.CategoryRepository;
import com.fuji.api.online_test.repository.UserRepository;

@RestController
@RequestMapping("category/")
public class MenuController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/category-by-userid/{user_id}", produces="application/json")
	public @ResponseBody Map getAllCategoryByUserId(@PathVariable("user_id") String userId) {
		int groupId = userRepository.findGroupIdByUserId(userId);
		List<Category> category = categoryRepository.findAllByUserGroup(groupId);
		HashMap<String, Object> value;
		List allCategory = new ArrayList();
		for(Category cat : category) {
			value = new HashMap<>();
			//value.put("moduleOrder", cat.getModuleOrder());
			value.put("moduleOrder", cat.getModuleOrder());
			value.put("moduleName", cat.getModuleName());
			
			allCategory.add(value);
		}
		
		HashMap<String, List> returnVal = new HashMap<>();
		returnVal.put("modules", allCategory);
		return returnVal;
	}
}
