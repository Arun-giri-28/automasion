package com.automasion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AutomasionController {
	@GetMapping(value="/jenkins")
	public String post() {
		return "I am fullstack developer";
		
	}
}