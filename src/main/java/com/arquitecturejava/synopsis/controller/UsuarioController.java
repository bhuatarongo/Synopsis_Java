package com.arquitecturejava.synopsis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arquitecturejava.synopsis.model.Usuario;
import com.arquitecturejava.synopsis.service.api.UsuarioServiceAPI;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceAPI usuarioServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",usuarioServiceAPI.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(Long id,Model model) {
		
		if (id!=null && id!=0) {
			model.addAttribute("Usuario", usuarioServiceAPI.get(id)); 
		}
		
		return "save";
	}
	
	
	@PostMapping("/save")
	public String save(Usuario usuario, Model model) {
		usuarioServiceAPI.save(usuario);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable long id,Model model) {
		usuarioServiceAPI.delete(id);
		return "redirect:/";
	}

}
