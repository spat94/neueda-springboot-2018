package uk.ac.belfastmet.dwarf.controller;

//import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
//import uk.ac.belfastmet.dwarf.service.DwarfService;

@Controller
@RequestMapping("tolkien")
public class TolkienController {
	
	DwarfRepository dwarfRepository;
	
	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("")
	public String tolkien(Model model) {
		
		//DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> tolkienDwarfs = dwarfService.getTolkienDwarfs();
		//model.addAttribute("tolkienDwarfs", tolkienDwarfs);
		
		
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("subTitle", "Tolkien Dwarves");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Tolkien"));
		return "dwarfPage.html";
	}
}
