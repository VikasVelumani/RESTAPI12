package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
@Value("${colour}")
private String colour;
@GetMapping("son")
public String myfav() {
	return "My favorite color is "+colour;
}
}
