package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.domain.Floor;
import uk.ac.belfastmet.buildings.service.BuildList;

@Controller
@RequestMapping("floorspace")
public class FloorspaceControl {
	
	@GetMapping("")
	public String volume(Model model)
	{
		BuildList buildList = new BuildList();
		ArrayList<Floor> byFloor = buildList.getFloors();
		
		model.addAttribute("pageTitle", "Largest by Floorspace");
		model.addAttribute("jumboTitle", "World's Largest Buildings by Floorspace");
		model.addAttribute("jumboSub", "As opposed to Footprint or Volume");
		model.addAttribute("byfloor", byFloor);
		return "floorspace.html";

	}

}

