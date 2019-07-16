package com.fuji.api.online_test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class News {
	@Id
	@Column(name = "news_id")
    private String id;
    private String headLine;
    private String newsContent;
    private Date startAt;
    private Date endAt;
    private Date createdAt;
    private Date updatedAt;
    private boolean status;
    
    
    public News() {
    	
    }
    
	public News(String id, String headLine, String newsContent, Date startAt, Date endAt, Date createdAt,
			Date updatedAt, boolean status) {
		super();
		this.id = id;
		this.headLine = headLine;
		this.newsContent = newsContent;
		this.startAt = startAt;
		this.endAt = endAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
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
