package br.com.rangeldev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiNotificationsOnesignalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNotificationsOnesignalApplication.class, args);
		System.out.print("Run /////> Notifications Onesignal,Run In Port: 8080\n");
		System.out.println ("Docs: http://localhost:8080/swagger-ui/index.html");
	}
}
