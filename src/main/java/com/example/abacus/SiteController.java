package com.example.abacus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}