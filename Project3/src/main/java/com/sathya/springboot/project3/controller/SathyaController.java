package com.sathya.springboot.project3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SathyaController {
@GetMapping("/sathya")
public String getRegForm() {
	return "Reg";
}
}
