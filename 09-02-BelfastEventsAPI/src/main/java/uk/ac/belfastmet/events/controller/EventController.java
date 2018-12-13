package uk.ac.belfastmet.events.controller;

import java.awt.Event;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;

@Controller
@RequestMapping("")
public class EventController {

	@GetMapping("/all")
	public String allEvents(Model model) 
	{
		String eventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents eventsList = restTemplate.getForObject(eventsUrl, AllEvents.class);
		
		model.addAttribute("eventsList", eventsList.getAllEvents());
		
		return "home";
		
		
	}
	
	
}
