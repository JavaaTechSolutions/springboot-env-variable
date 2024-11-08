package com.jts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EnvController {

	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private Environment env;
	
	@GetMapping
	public String getValue() {
		return env.getProperty("api.key");
	}
}
