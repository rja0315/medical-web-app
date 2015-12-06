package com.rja0315.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	
	private String description;
	
	@Column(name = "published_date")
	private Date publisheddate;

	private String link;
	
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Record record;

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublisheddate() {
		return publisheddate;
	}

	public void setPublisheddate(Date publisheddate) {
		this.publisheddate = publisheddate;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	} 
	
}
