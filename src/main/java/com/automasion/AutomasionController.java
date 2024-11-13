package com.automasion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AutomasionController {
	@GetMapping(value="/devapp")
	public String post() {
		return "hello world";
		
	}
}