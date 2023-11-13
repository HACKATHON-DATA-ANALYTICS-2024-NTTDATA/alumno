package hackathon.nttdata.coderpath.alumno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlumnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnoApplication.class, args);
	}

}
