package com.fuji.api.online_test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fuji.api.online_test.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{
	@Query("FROM Category category where category.groupId = :groupId")
	public abstract List<Category> findAllByUserGroup(@Param("groupId") int groupId);
	
	
	
//	@Query("SELECT category.group_id, category.module_name, category.module_order FROM category INNER JOIN user_db ON category.group_id = user_db.group_WHERE user_db.user_id = :userId")
//	public abstract List<Category> findAllByUserId(@Param("userId") String userId);
}
