package uk.ac.belfastmet.movies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.movies.domain.Chars;
import uk.ac.belfastmet.movies.service.CharService;

@Controller
@RequestMapping("shrek")

public class ShrekController 
{
	@GetMapping("")
	public String shrek(Model model)
	{
		CharService charService = new CharService();
		ArrayList<Chars> shrekChars = charService.getShrekChars();
		
		model.addAttribute("shrekChars", shrekChars);
		return "shrek.html";
	}
	
}
