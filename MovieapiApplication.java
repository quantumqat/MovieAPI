package project.alexwinkler.movieapi.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MovieapiApplication {


	public static void main(String[] args) {
		SpringApplication.run(MovieapiApplication.class, args);

	}

}
