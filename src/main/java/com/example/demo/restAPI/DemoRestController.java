package com.example.demo.restAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.errorHandling.ContentNotFound;


@RestController
@RequestMapping("/rest")
public class DemoRestController {
	
	@GetMapping(value="/pathParam/{value}")
	public String pathParameter(@PathVariable("value") int val) {
		return "Path parameter value : " + val;
	}
	
	@PostMapping(value="/simplePost")
	public String simplePost(@RequestBody DemoModel model) {
		return "You sent request body with : " + model.toString();
	}
	
	@GetMapping(value="/jsonResponse")
	@ResponseBody
	public DemoModel jsonResponse()  {
		return jsonResponse("Hello, World!");
		
	}
	
	@GetMapping(value="/jsonResponse/{message}")
	@ResponseBody
	public DemoModel jsonResponse(@PathVariable("message") String message)  {
		DemoModel dm = new DemoModel();
		dm.setTestString(message);
		return dm;
		
	}
	
	@GetMapping(value="/basicException")
	public String throwError() {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "This method throws an error", null);	
	}
	
	@GetMapping(value="/contentNotFound")
	public String throwContentNotFound() throws ContentNotFound {
		throw new ContentNotFound("Throwing an error to global exception handler");
		
	}
	
	
}










