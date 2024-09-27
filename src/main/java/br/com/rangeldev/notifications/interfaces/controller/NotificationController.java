package br.com.rangeldev.notifications.interfaces.controller;
import br.com.rangeldev.notifications.aplication.service.NotificationService;
import br.com.rangeldev.notifications.domain.dto.NotificationDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<String> sendNotification(@Valid @RequestBody NotificationDTO notificationDTO) {
        notificationService.sendNotification(notificationDTO);
        return ResponseEntity.ok("Notification OK sent successfully");
    }
}

