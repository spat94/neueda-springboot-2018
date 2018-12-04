package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PassengerController {

	@GetMapping("passenger")
	
	public String passenger(Model model)
	
	{
		model.addAttribute("pageTitle", "Passengers");
		return "passengersPage.html";	
		
	}
}
