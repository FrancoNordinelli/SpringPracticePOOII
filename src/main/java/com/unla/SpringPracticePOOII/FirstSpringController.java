package com.unla.SpringPracticePOOII;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Tipo de componente
@RestController
//Ruta por la que se accede a través de Request
@RequestMapping("/firstspring")
public class FirstSpringController {

	//Se accede al método a trávés de una get request
	@GetMapping("helloworld")
	public String helloWorld() {
		return "Hello World";
	}
}
