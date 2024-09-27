package br.com.rangeldev.notifications.aplication.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${onesignal.api.description}")
    private  String descriptioin;
    @Value("${onesignal.api.summary}")
    private  String summary;
    @Value("${onesignal.api.name}")
    private  String name;
    @Value("${onesignal.api.email}")
    private  String email;
    @Value("${onesignal.api.version}")
    private  String apiVersion;
    @Value("${onesignal.api.urlLicenci}")
    private  String urlLicenci;

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info().title("Notification API")
                .description(descriptioin)
                .summary(summary)
                .license(new License()
                        .name("Apache 2.0")
                        .url(urlLicenci))
                .version(apiVersion)
                .contact(new Contact()
                        .name(name)
                        .email(email)
                        .url("https://rangeldev.com.br"))
        );
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder().group("public").packagesToScan("br.com.rangeldev.notifications").build();
    }
}

