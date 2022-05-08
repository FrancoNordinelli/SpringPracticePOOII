package controllers;

//No funciona sólo con @Controller para la clase
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Tipo de componente
@ResponseBody

//Ruta por la que se accede a través de Request
@RequestMapping("/")
public class HomeController {

	//Se accede al método a trávés de una get request
	@GetMapping("")
	public String helloWorld() {
		return "home/index";
	}
}
