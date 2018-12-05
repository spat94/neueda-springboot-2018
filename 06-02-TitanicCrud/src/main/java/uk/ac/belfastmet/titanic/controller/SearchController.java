package uk.ac.belfastmet.titanic.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

	@Controller
	@RequestMapping
	public class SearchController {
		
		PassengerRepository passengerRepository;
		

		public SearchController(PassengerRepository passengerRepository) {
			super();
			this.passengerRepository = passengerRepository;
		}

		@GetMapping("/searchid")
		public String searchid(@RequestParam("id") Integer passengerID, Model model)
		{
			model.addAttribute("pageTitle", "Search");
			model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerID));
			return "passengersPage.html";
		}

	}


