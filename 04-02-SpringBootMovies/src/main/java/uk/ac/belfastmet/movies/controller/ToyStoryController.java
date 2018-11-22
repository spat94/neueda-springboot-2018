package uk.ac.belfastmet.movies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.movies.domain.Chars;
import uk.ac.belfastmet.movies.service.CharService;

@Controller
@RequestMapping("toystory")

public class ToyStoryController 
{
	@GetMapping("")
	public String toystory(Model model)
	{
		CharService charService = new CharService();
		ArrayList<Chars> toyStoryChars = charService.getToyStoryChars();
		
		model.addAttribute("toyStoryChars", toyStoryChars);
		return "toystory.html";
	}
	
}
