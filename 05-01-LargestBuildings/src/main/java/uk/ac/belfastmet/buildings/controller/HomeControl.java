package uk.ac.belfastmet.buildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HomeControl {

	@GetMapping("")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("jumboTitle", "World's Largest Buildings");
		model.addAttribute("jumboSub", "Organised by Volume, Usable Floorspace, and Footprint");
		return "index.html";
	}

}
