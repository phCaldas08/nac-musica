package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String getFormMusica(@RequestParam String type, @RequestParam(required = false) Integer id, Model model) {

		String page = "form-musica";
		model.addAttribute("tipo", type);

		switch (type) {
		case "detalhe":
		case "editar":
			model.addAttribute("musicaModel", MusicaRepository.getInstance().findById(id));
			break;
		case "novo":
			model.addAttribute("musicaModel", new MusicaModel(0, "", "", "", 0.00, 2000, ""));
			break;
		default:
			page = "redirect:/musica";
			break;

		}

		return page;
	}

	@PutMapping()
	public String putMusica(@Valid @ModelAttribute MusicaModel musicaModel, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors())
			return "form-musica";
		
		MusicaRepository.getInstance().update(musicaModel);
		redirectAttributes.addFlashAttribute("messages", "Musica atualizada com sucesso!!!");

		return "redirect:/musica";
	}

	@PostMapping()
	public String postMusica(@Valid @ModelAttribute MusicaModel musicaModel, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors())
			return "form-musica";
		
		MusicaRepository.getInstance().insert(musicaModel);
		redirectAttributes.addFlashAttribute("messages", "Musica cadastrada com sucesso!!!");

		return "redirect:/musica";
	}

	@DeleteMapping("/{id}")
	public String deleteMusica(@PathVariable int id, RedirectAttributes redirectAttributes) {
		MusicaRepository.getInstance().delete(id);
		redirectAttributes.addFlashAttribute("messages", "Musica excluida com sucesso!!!");

		return "redirect:/musica";
	}

}