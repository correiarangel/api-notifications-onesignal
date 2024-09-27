package br.com.rangeldev.notifications.service;


import br.com.rangeldev.notifications.aplication.service.NotificationService;
import br.com.rangeldev.notifications.domain.dto.NotificationDTO;
import br.com.rangeldev.notifications.infrastructure.gateway.OneSignalGateway;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationServiceTest {

    @Test
    void shouldSendNotification() {
        OneSignalGateway gatewayMock = Mockito.mock(OneSignalGateway.class);
        NotificationService service = new NotificationService(gatewayMock);

        NotificationDTO request = new NotificationDTO();
        request.setAppId("testAppId");
        request.setApiKey("testApiKey");
        request.setEnMessage("Test English Message");
        request.setPtMessage("Mensagem em Português");

        service.sendNotification(request);

        Mockito.verify(gatewayMock, Mockito.times(1)).sendNotification(request);
    }
}