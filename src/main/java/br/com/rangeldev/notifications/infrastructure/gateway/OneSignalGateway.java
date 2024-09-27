package br.com.rangeldev.notifications.infrastructure.gateway;


import br.com.rangeldev.notifications.domain.dto.NotificationDTO;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class OneSignalGateway {

    @Value("${onesignal.api.url}")
    private  String url;

    public ResponseEntity<String> sendNotification(NotificationDTO request) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(url);

            // Criação do payload da notificação
            String json = createNotificationPayload(request);
            StringEntity entity = new StringEntity(json);

            post.setEntity(entity);
            post.setHeader("Content-Type", "application/json; charset=UTF-8");
            post.setHeader("Authorization", "Basic " + request.getApiKey());

            CloseableHttpResponse response = client.execute(post);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            return ResponseEntity.ok("Response Code : " + response.getStatusLine().getStatusCode());


        } catch (IOException err) {
            throw new RuntimeException(err);
        }
    }
    private String createNotificationPayload(NotificationDTO request) {
        return "{ \"app_id\": \"" + request.getAppId() + "\", " +
                "\"headings\": {\"en\": \"" + request.getEnHeading() + "\", \"pt\": \"" + request.getPtHeading() + "\"}," +
                "\"contents\": {\"en\": \"" + request.getEnMessage() + "\", \"pt\": \"" + request.getPtMessage() + "\"}," +
                "\"small_icon\": \"" + request.getSmallIcon() + "\"," +
                "\"external_id\": \"" + request.getExternalId() + "\"" +
                "}";
    }
}
