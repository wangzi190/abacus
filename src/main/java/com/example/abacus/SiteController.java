package com.example.abacus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/about-us")
	public String aboutUs() {
		return "about-us";
	}
	@GetMapping("/history")
	public String history() {
		return "history";
	}
	@GetMapping("/guides")
	public String guides() {
		return "guides";
	}

}