package com.fuji.api.online_test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class TransactionHistory {
	@Id
    private String thId;
	private String userId;
	private String orderID;
    private String status;
    private Date createdAt;
    
    public TransactionHistory() {
    	
    }
    
	public TransactionHistory(String thId, String userId, String orderID, String status, Date createdAt) {
		super();
		this.thId = thId;
		this.userId = userId;
		this.orderID = orderID;
		this.status = status;
		this.createdAt = createdAt;
	}

	public String getThId() {
		return thId;
	}

	public void setThId(String thId) {
		this.thId = thId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
    
    
    
}



