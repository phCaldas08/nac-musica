package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/musica")
public class MusicaController {
	
	
	@GetMapping()
	public String getMusica() {
		return "index";
	}
	
}
