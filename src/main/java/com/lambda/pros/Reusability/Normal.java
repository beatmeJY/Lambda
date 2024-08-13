package com.lambda.pros.Reusability;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Normal {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callApi1() {
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(
                "https://localhost:8081/api1", String.class
            );
            return response.getBody();
        } catch (RestClientException ex) { // 중복 처리
            throw new RuntimeException("외부 통신 중 예외 처리");
        } catch (Exception e) {
            throw new RuntimeException("내부 예외 처리");
        }
    }

    public String callApi2() {
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(
                "https://localhost:8081/api2", String.class
            );
            return response.getBody();
        } catch (RestClientException ex) { // 중복 처리
            throw new RuntimeException("외부 통신 중 예외 처리");
        } catch (Exception e) {
            throw new RuntimeException("내부 예외 처리");
        }
    }
}
