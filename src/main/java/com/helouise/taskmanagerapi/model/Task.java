package com.helouise.taskmanagerapi.model;

import java.time.LocalDate;

public class Task {
	
	private Long id;
	private String title;
	private String content;
	private PriorityOrderEnum sorting;
	private LocalDate dueDate;
	private Boolean overDue;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public PriorityOrderEnum getSorting() {
		return sorting;
	}
	public void setSorting(PriorityOrderEnum sorting) {
		this.sorting = sorting;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getOverDue() {
		return overDue;
	}
	public void setOverDue(Boolean overDue) {
		this.overDue = overDue;
	}
	
}
