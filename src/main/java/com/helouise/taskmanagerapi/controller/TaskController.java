package com.helouise.taskmanagerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.helouise.taskmanagerapi.model.Task;
import com.helouise.taskmanagerapi.repository.TaskRepository;

@RestController
//É uma classe que vai receber requisições
@RequestMapping("/tasks")
//Vai mapear os endpoints
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;
	@GetMapping
	//quando chegar uma requisição usando o verbo http get
	//no endpoint /tasks esse é o método que vai responder essa requisição
	public List<Task> list() {
		return taskRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task add(@RequestBody Task task) {
		return taskRepository.save(task);
	}

}
