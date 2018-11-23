package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.domain.Foot;
import uk.ac.belfastmet.buildings.service.BuildList;

@Controller
@RequestMapping("footprint")
public class FootprintControl {
	
	@GetMapping("")
	public String volume(Model model)
	{
		BuildList buildList = new BuildList();
		ArrayList<Foot> byFoot = buildList.getFoots();
		model.addAttribute("pageTitle", "Largest by Footprint");
		model.addAttribute("jumboTitle", "World's Largest Buildings by Footprint");
		model.addAttribute("jumboSub", "As opposed to Volume or Floorspace");
		model.addAttribute("byFoot", byFoot);
		return "footprint.html";

	}

}
