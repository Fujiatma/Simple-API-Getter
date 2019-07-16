package com.fuji.api.online_test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Category {
	@Id
	private int categoryId;
	private int groupId;
	private String moduleName;
    private String description;
    private int moduleOrder;
    private Date createdAt;
    private Date updatedAt;
    
    public Category() {
    	
    }
    
	public Category(int categoryId, int groupId, String moduleName, String description, int moduleOrder, Date createdAt,
			Date updatedAt) {
		super();
		this.categoryId = categoryId;
		this.groupId = groupId;
		this.moduleName = moduleName;
		this.description = description;
		this.moduleOrder = moduleOrder;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getModuleOrder() {
		return moduleOrder;
	}

	public void setModuleOrder(int moduleOrder) {
		this.moduleOrder = moduleOrder;
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



