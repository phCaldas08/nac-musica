package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.repository.MusicaRepository;

@Controller
@RequestMapping("/musica")
public class MusicaController {
	
	
	@GetMapping()
	public String getMusica(Model model) {
		
		model.addAttribute("musicas", MusicaRepository.getInstance().findAll());
		
		return "musicas";
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteMusica(@PathVariable int id) {
		MusicaRepository.getInstance().delete(id);
		
		return "redirect:/musica";
	}
	
	
}
