package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.domain.Vol;
import uk.ac.belfastmet.buildings.service.BuildList;

@Controller
@RequestMapping("volume")
public class VolControl {
	
	@GetMapping("")
	public String volume(Model model)
	{
		BuildList buildList = new BuildList();
		ArrayList<Vol> byvol = buildList.getVols();
		
		model.addAttribute("pageTitle", "Largest by Volume");
		model.addAttribute("jumboTitle", "World's Largest Buildings by Volume");
		model.addAttribute("jumboSub", "As opposed to Footprint or Floorspace");
		model.addAttribute("byvol", byvol);
		return "volume.html";

	}

}
