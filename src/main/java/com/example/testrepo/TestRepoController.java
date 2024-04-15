package com.example.testrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRepoController {

	@Autowired
	private GreetingProps props;
	
	@GetMapping("/")
	public String getMessage() {
		return props.getMessage();
	}

}