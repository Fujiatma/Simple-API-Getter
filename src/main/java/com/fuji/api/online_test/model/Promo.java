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
public class Promo {
	@Id
	private String promoId;
	private String name;
    private String type;
    private String description;
    private Date startAt;
    private Date endAt;
    private Date createdAt;
    private Date updatedAt;
    private boolean status;
    
    public Promo() {
    	
    }
    
	public Promo(String promoId, String name, String type, String description, Date startAt, Date endAt, Date createdAt,
			Date updatedAt, boolean status) {
		super();
		this.promoId = promoId;
		this.name = name;
		this.type = type;
		this.description = description;
		this.startAt = startAt;
		this.endAt = endAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	public String getPromoId() {
		return promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
    
    
}


