package com.fuji.api.online_test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fuji.api.online_test.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{
	@Query("FROM Category category where category.groupId = :groupId ")
	public abstract List<Category> findAllByUserGroup(@Param("groupId") int groupId);
}
