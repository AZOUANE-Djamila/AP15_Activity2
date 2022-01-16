package Master15.Springboot_SI_AZOUANEDjamila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
@RestController

@SpringBootApplication
public class AP15Application {
	@GetMapping("/")
	public String index(@RequestParam(value="nom", defaultValue = "Visiteur") String nom){
	    return String.format("Bonjour %s!", nom);
	}
	@GetMapping("/quitter")
	public String bye () {
	    return "Au revoir" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(AP15Application.class, args);
	}
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("file:static/");
    }
}
