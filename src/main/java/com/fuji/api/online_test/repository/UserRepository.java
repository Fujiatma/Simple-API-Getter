package com.fuji.api.online_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fuji.api.online_test.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	@Query("SELECT user.groupId FROM User user where user.userId = :id")
	public int findGroupIdByUserId(@Param("id") String id);
}
