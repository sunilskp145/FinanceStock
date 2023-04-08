package com.Finance.stock.service;

import com.Finance.stock.response.CompanyResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CompanyService {
    @Value("${Url}")
    private String finance;

    @Value("${apiKey}")
    private String key;

    @Value("${hostKey}")
    private String hostKey;

    public CompanyResponse getResponse(String q){

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", key);
        headers.set("X-RapidAPI-Host",hostKey);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<CompanyResponse> TaskResponse = new RestTemplate().exchange(finance +q, HttpMethod.GET, entity, CompanyResponse.class);
        CompanyResponse companyResponse = TaskResponse.getBody();
        return companyResponse;
    }
}
