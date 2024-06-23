package in.kanha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {

	@GetMapping("/")
	public String getMsg()
	{
		return " Welcome to Kanha IT";
	}
}
