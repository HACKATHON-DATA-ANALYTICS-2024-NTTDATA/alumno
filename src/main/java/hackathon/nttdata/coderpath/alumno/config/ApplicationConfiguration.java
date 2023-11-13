package hackathon.nttdata.coderpath.alumno.config;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConfigurationProperties
@RefreshScope
@Getter
@Setter
public class ApplicationConfiguration {

	@Value("${config.balanceador.test}")
	private String balanceadorTest;

	@Value("${config.base.endpoint}")
	private String urlCursos;

	@Bean
	public WebClient registrarWebClient() {

		return WebClient.create(urlCursos);

	}
	
	
	
	
	

}
