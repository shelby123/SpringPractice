package com.example.demo.restTemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

	
	@RequestMapping("/Todo")
	public String getTodo() {
		RestTemplate restTemplate = new RestTemplate();
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class);
        return todo.toString();
	}
}
