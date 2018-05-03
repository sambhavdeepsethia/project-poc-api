package com.poc.project;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "projects")
public class Project {
	

	@Id
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	@NotNull
	private String status;
	@Column(name = "priority")
	private String priority;
	@Column(name = "manager")
	private String manager;
	@Column(name = "comments")
	private String comments;
	
	public Project() {}
	
	
	public Project( String name, String status, String priority, String manager, String comments) {
		super();
		this.name = name;
		this.status = status;
		this.priority = priority;
		this.manager = manager;
		this.comments = comments;
	}
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
