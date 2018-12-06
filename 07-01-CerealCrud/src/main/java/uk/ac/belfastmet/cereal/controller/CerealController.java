package uk.ac.belfastmet.cereal.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uk.ac.belfastmet.cereal.repository.CerealRepository;

public class CerealController {
	
	CerealRepository cerealRepository;
	
	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;//This implements the interface "cerealRepository" which contains abstract methods
	}

	@GetMapping("/cereals") //linked to /cereals URL
	public String cerealPage(Model model)
	{
		model.addAttribute("pageTitle", "Cereals");
		return "cerealPage"; //method body uses thymeleaf to specify the page title as "Cereals" and returns "cerealPage.html" when called
	}
	
}
