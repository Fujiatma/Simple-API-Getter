package com.fuji.api.online_test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class FlashSale {
	@Id
	private String flashSaleId;
	private String promoId;
	private String productId;
    private String name;
    private String description;
    private int quantity;
    private Date startAt;
    private Date endAt;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    
    public FlashSale() {
    	
    }
    
	public FlashSale(String flashSaleId, String promoId, String productId, String name, String description,
			int quantity, Date startAt, Date endAt, boolean status, Date createdAt, Date updatedAt) {
		super();
		this.flashSaleId = flashSaleId;
		this.promoId = promoId;
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.startAt = startAt;
		this.endAt = endAt;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(String flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public String getPromoId() {
		return promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
