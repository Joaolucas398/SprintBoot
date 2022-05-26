package com.generation.heloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*CONTROL+SHIFT+O importar automaticamente*/

//indica que é uma classe controladora

@RestController

//serve para a construçãp dos endpoint da api

@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "BMs generation: Responsabilidade pessoal\r\n"
				+ "Mentalidade de crescimento\r\n"
				+ "Orientação ao futuro\r\n"
				+ "Persistência\r\n"
				+ "\r\n"
				+ "Comunicação\r\n"
				+ "Adaptabilidade\r\n"
				+ "Trabalhar em equipe\r\n"
				+ "Proatividade";
		
	}
	
	

}
