package br.com.alura.SpringBootAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAdminServer
@EnableAutoConfiguration
public class SpringBootAdminApplication {

	/**
	 * @author Dênis Alves
	 * @see@https://codecentric.github.io/spring-boot-admin/2.3.1/ 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}

}
