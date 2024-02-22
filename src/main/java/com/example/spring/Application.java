package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(path = "/")
	public Map<String,String> getMessage(){
		Map<String,String> map = new HashMap<>();
		map.put("Hello","World");
		map.put("Java","17");
		map.put("Argo","CD");
		return map;
	}


}
