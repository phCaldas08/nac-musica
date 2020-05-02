package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fiap.model.MusicaModel;
import br.com.fiap.repository.MusicaRepository;

@Controller
@RequestMapping("/musica")
public class MusicaController {
	
	
	@GetMapping()
	public String getMusica(Model model) {
		
		model.addAttribute("musicas", MusicaRepository.getInstance().findAll());
		
		return "musicas";
	}
	
	@GetMapping("/form")
	public String getFormMusica(@RequestParam String type, @RequestParam(required = false) Integer id,
				Model model) {
		
		String page = "form-musica";
		model.addAttribute("tipo", type);
		
		switch(type) {
			case "detalhe":
			case "editar":
				model.addAttribute("musicaModel",MusicaRepository.getInstance().findById(id));
				break;
			case "novo":
				model.addAttribute("musicaModel", new MusicaModel(0, "", "", "", 0.00, 2000));
				break;
			default:
				page = "redirect:/musica";
				break;
			
		}
		
		return page;
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteMusica(@PathVariable int id) {
		MusicaRepository.getInstance().delete(id);
		
		return "redirect:/musica";
	}
	
	
}
