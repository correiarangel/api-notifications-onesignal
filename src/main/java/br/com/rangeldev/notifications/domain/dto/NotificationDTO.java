package br.com.rangeldev.notifications.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NotificationDTO {

    @NotBlank(message = "O campo 'appId' não pode ser nulo ou vazio.")
    @Size (min = 35, message = "O campo 'appId' deve ter 35 caracteres ou mais.")
    private String appId;

    @NotBlank(message = "O campo 'apiKey' não pode ser nulo ou vazio.")
    @Size(min = 40, message = "O campo 'apiKey' deve ter 40 caracteres ou mais.")
    private String apiKey;

    @NotBlank(message = "O campo 'ptMessage' não pode ser nulo ou vazio.")
    @Size(min = 3, message = "O campo 'ptMessage' deve ter 3 caracteres ou mais.")
    private String ptMessage;

    @NotBlank(message = "O campo 'enMessage' não pode ser nulo ou vazio.")
    @Size(min = 3, message = "O campo 'ENMessage' deve ter 3 caracteres ou mais.")
    private String enMessage;

    @NotBlank(message = "O campo 'enHeading' não pode ser nulo ou vazio.")
    @Size(min = 3, message = "O campo 'enHeading' deve ter 3 caracteres ou mais.")
    private String enHeading;

    @NotBlank(message = "O campo 'ptHeading' não pode ser nulo ou vazio.")
    @Size(min = 3, message = "O campo 'ptHeading' deve ter 3 caracteres ou mais.")
    private String ptHeading;

    // smallIcon pode ser null ou vazio, logo, não aplicamos validação
    private String smallIcon;

    @NotBlank(message = "O campo 'externalId' não pode ser nulo ou vazio.")
    @Size(min = 1, message = "O campo 'ptHeading' deve ter 1 caracteres ou mais.")
    private String externalId;
}