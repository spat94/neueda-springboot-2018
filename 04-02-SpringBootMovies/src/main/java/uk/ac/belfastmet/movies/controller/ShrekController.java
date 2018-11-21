package uk.ac.belfastmet.movies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shrek")

public class ShrekController 
{
	@GetMapping("")
	public String shrek(Model model)
	{
		return "shrek.html";
	}
	
}
