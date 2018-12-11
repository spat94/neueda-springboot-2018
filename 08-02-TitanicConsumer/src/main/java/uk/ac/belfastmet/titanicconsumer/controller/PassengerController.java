package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("/titanic")
public class PassengerController {
	
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;

	public PassengerController() {
		super();
	}
	
	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}

	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) 
	{
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}

	@GetMapping("/passengers")
	public String allPassengers(Model model)
	{
		model.addAttribute("pageTitle", "Passengers");
		ArrayList<Passenger> passengers = this.passengerService.list();
		model.addAttribute("passengers", passengers);
		return "passengersPage";
	}
	
	@GetMapping("/passengers/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle", "View Passenger");
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passengers", passenger);
		
		return "viewPassenger";
	}
	
	
	@GetMapping("/passengers/add/")
	public String addPassenger(Model model)
	{
		model.addAttribute("pageTitle", "Add a Passenger Record");
		
		Passenger passenger = new Passenger();
		model.addAttribute("passenger", passenger);
		
		return "editPassenger";
	}
	
	//Edit Passenger
	@GetMapping("/passengers/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("pageTitle", "Add passenger");
		model.addAttribute("passenger", this.passengerService.update(passenger));
		
		return "editPassenger";
	}
	
	@PostMapping("/save")
	public String save(Passenger passenger, @RequestParam("addUpdate") String addUpdate, Model model,  RedirectAttributes redirectAttributes)
	{
		if(addUpdate.equals("Add passenger"))
		{
			this.passengerService.add(passenger);
			return "redirect:/titanic/passengers/";
		}
		else
		{
			this.passengerService.update(passenger);
			return "redirect:/titanic/passengers/";
		}
	}
	
	
	@GetMapping("/passengers/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes)
	{
		this.passengerService.delete(passengerId);
		redirectAttributes.addFlashAttribute("message", "Passenger Deleted Successfully");
		
		return "redirect:/titanic/passengers/";
	}
	
}
