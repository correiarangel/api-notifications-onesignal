package br.com.rangeldev.notifications.aplication.service;

import br.com.rangeldev.notifications.domain.dto.NotificationDTO;
import org.springframework.http.ResponseEntity;

public interface INotificationService {
     ResponseEntity<String> sendNotification(NotificationDTO requestDTO);
}