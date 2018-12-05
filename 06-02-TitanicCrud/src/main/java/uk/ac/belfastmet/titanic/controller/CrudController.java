package uk.ac.belfastmet.titanic.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

	@Controller
	@RequestMapping("/")
	public class CrudController {
		
		PassengerRepository passengerRepository;
		

		public CrudController(PassengerRepository passengerRepository) {
			super();
			this.passengerRepository = passengerRepository;
		}

		@GetMapping("/view/{passengerId}")
		public String searchid(@PathVariable("passengerId") Integer passengerID, Model model)
		{
			model.addAttribute("pageTitle", "Search");
			model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerID));
			return "viewPassenger.html";
		}

	}
