package com.lambda.pros.Reusability;

import java.util.function.Supplier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Lambda {
    private final RestTemplate restTemplate = new RestTemplate();

    public String callApi1() {
        return executeWithExceptionHandling(() -> {
            ResponseEntity<String> response = restTemplate.getForEntity(
                "https://example.com/api1", String.class
            );
            return response.getBody();
        });
    }

    public String callApi2() {
        return executeWithExceptionHandling(() -> {
            ResponseEntity<String> response = restTemplate.getForEntity(
                "https://example.com/api2", String.class
            );
            return response.getBody();
        });
    }

    // 공통 예외 처리 람다
    private <T> T executeWithExceptionHandling(Supplier<T> apiCall) {
        try {
            return apiCall.get();
        } catch (RestClientException ex) {
            throw new RuntimeException("외부 통신 중 예외 처리");
        } catch (Exception e) {
            throw new RuntimeException("내부 예외 처리");
        }
    }
}
