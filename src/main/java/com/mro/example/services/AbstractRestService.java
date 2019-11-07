package com.mro.example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

abstract class AbstractRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractRestService.class);

    <T> ResponseEntity<T> get(String url, Class<T> clazz) {
        RestTemplate template = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "some User-Agent");

        //Create a new HttpEntity
        final HttpEntity<String> entity = new HttpEntity<>(headers);

        LOGGER.info("Calling URL: " + url);

        return template.exchange(url, HttpMethod.GET, entity, clazz);
    }
}
