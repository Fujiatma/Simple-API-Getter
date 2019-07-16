package com.fuji.api.online_test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
	@Id
	private String userId;
	private int groupId;
	//additional information
	private String name;
    private String email;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    
    public User() {
    	
    }
    
	public User(String userId, int groupId, String name, String email, String username, String password, Date createdAt,
			Date updatedAt) {
		super();
		this.userId = userId;
		this.groupId = groupId;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    
}

