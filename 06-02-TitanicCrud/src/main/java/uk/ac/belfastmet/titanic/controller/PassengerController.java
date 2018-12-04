package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("passenger")
public class PassengerController {
	
	PassengerRepository passengerRepository;
		
		public PassengerController(PassengerRepository passengerRepository) 
			{
				super();
				this.passengerRepository = passengerRepository;
			}

	@GetMapping("")	
	public String passenger(Model model)
	
	{
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerRepository.findAll());
		return "passengersPage.html";	
	}
}
