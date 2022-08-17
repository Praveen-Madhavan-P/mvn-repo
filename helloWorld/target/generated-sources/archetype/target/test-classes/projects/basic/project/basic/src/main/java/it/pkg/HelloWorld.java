package it.pkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/")
	public String printHelloWorld() {
		return "Hello World";
	}

}
