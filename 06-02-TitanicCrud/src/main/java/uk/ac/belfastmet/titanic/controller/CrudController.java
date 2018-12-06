package uk.ac.belfastmet.titanic.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
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
		
		@GetMapping("/add")
		public String addPassenger(Model model)
		{
			model.addAttribute("pageTitle", "Add a Record");
			model.addAttribute("passenger", new Passenger());
			return "editPassenger";
		}
		
		@GetMapping("/delete/{passengerId}")
		public String deletePassenger(@PathVariable("passengerId") Integer passengerID, Model model, RedirectAttributes redirectAttributes)
		{
			this.passengerRepository.deleteById(passengerID);
			redirectAttributes.addFlashAttribute("message", "Passenger Deleted Successfully");
			return "redirect:/all";
		}
		
		@GetMapping("/edit/{passengerId}")
		public String editPassenger(@PathVariable("passengerId") Integer passengerID, Model model)
		{
			model.addAttribute("pageTitle", "Edit Passenger");
			model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerID));
			return "editPassenger";
		}
		
		@PostMapping("/save")
		public String savePassenger(Passenger passenger, Model model, RedirectAttributes redirectAttributes)
		{
			Passenger savedPassenger = this.passengerRepository.save(passenger);
			return "redirect:/view/" + savedPassenger.getPassengerId();
		}
	}
