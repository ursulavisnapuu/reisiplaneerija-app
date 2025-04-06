package ee.ursulavisnapuu.reisiplaneerija.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class AmadeusService {

    @Value("${amadeus.client-id}")
    private String clientId;

    @Value("${amadeus.client-secret}")
    private String clientSecret;

    private String accessToken;
    private long tokenExpirationTime;

    public String getAccessToken() {
        if (accessToken == null || System.currentTimeMillis() >= tokenExpirationTime) {
            fetchNewAccessToken();
        }
        return accessToken;
    }

    private void fetchNewAccessToken() {
        String url = "https://test.api.amadeus.com/v1/security/oauth2/token";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String body = "grant_type=client_credentials"
                + "&client_id=" + clientId
                + "&client_secret=" + clientSecret;

        HttpEntity<String> request = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        JSONObject json = new JSONObject(response.getBody());
        accessToken = json.getString("access_token");
        int expiresIn = json.getInt("expires_in");
        tokenExpirationTime = System.currentTimeMillis() + (expiresIn * 1000L);
    }

    public String getActivitiesByGeo(double lat, double lon) {
        String url = "https://test.api.amadeus.com/v1/shopping/activities?latitude=" + lat + "&longitude=" + lon;
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(getAccessToken());

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response.getBody();
    }
}
