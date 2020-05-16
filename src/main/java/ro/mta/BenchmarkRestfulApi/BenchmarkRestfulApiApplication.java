package ro.mta.BenchmarkRestfulApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BenchmarkRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenchmarkRestfulApiApplication.class, args);
	}

}
