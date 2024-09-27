package br.com.rangeldev.notifications.aplication.service;

import br.com.rangeldev.notifications.domain.dto.NotificationDTO;
import br.com.rangeldev.notifications.infrastructure.gateway.OneSignalGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class NotificationService implements INotificationService {

    private final OneSignalGateway oneSignalGateway;

    public NotificationService(OneSignalGateway oneSignalGateway) {
        this.oneSignalGateway = oneSignalGateway;
    }

    public ResponseEntity<String> sendNotification(NotificationDTO notificationRequest) {
        try {
            // Envio da notificação via OneSignal
            ResponseEntity<String> response = oneSignalGateway.sendNotification(notificationRequest);

            // Verificar o status retornado pela API do OneSignal
            if (response.getStatusCode() == HttpStatus.FORBIDDEN) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN)
                        .body("Error 403: Authorization failed. Please check your credentials (appId and apiKey).");
            }

            if (response.getStatusCode() != HttpStatus.OK) {
                return ResponseEntity.status(response.getStatusCode())
                        .body("Failed to send notification: " + response.getBody());
            }

            // Notificação enviada com sucesso
            return ResponseEntity.ok("Notification OK Sent Successfully");

        } catch (Exception e) {
            // Em caso de exceções gerais, retornar erro interno do servidor
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Server error when trying to send notification: " + e.getMessage());
        }
    }
}