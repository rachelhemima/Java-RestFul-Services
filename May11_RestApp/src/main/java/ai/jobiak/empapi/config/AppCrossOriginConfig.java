package ai.jobiak.empapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppCrossOriginConfig implements WebMvcConfigurer {

public void addCrosMappings(CorsRegistry registry){
	registry.addMapping("/**")
				.allowedOriginPatterns("http://localhost:4200")
				.allowedMethods("GET");

	}
}
