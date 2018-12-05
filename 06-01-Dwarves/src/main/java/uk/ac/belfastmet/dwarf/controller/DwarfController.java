package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;


@Controller
@RequestMapping("/")
public class DwarfController {
	
	DwarfRepository dwarfRepository;
	
	public DwarfController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) 
	{
		model.addAttribute("pageTitle", "View");
		model.addAttribute("subTitle", "View Dwarfs");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		return "viewDwarf";
	}
	
	@GetMapping("/delete/{dwarfId}")
	public String deleteDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model, RedirectAttributes redirectAttributes) 
	{
		this.dwarfRepository.deleteById(dwarfId);
		redirectAttributes.addFlashAttribute("message", "Dwarf Deleted Successfully");
		return "redirect:/";
	}
}
