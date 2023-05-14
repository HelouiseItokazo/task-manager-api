package com.helouise.taskmanagerapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helouise.taskmanagerapi.model.Task;

@RestController
//É uma classe que vai receber requisições
@RequestMapping("/tasks")
//Vai mapear os endpoints
public class TaskController {
	
	@GetMapping
	//quando chegar uma requisição usando o verbo http get
	//no endpoint /tasks esse é o método que vai responder essa requisição
	public List<Task> test() {
		return null;
	}

}
