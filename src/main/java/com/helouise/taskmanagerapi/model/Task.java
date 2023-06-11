package com.helouise.taskmanagerapi.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "T_TASK")
@SequenceGenerator(name = "task", sequenceName = "SQ_T_TASK", allocationSize = 1)
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task")
	private Long id;
	
	@Column(name = "ds_title", length = 20, nullable = false)
	private String title;
	
	@Column(name = "ds_content", nullable = false)
	private String content;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_priority")
	private PriorityOrderEnum sorting;
	
	@Column(name = "dt_due")
	private LocalDate dueDate;
	
	@Column(name = "stts_over_due")
	private Boolean overDue;
		
}
