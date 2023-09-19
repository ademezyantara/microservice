package com.project.common.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api/common")
public class CommonUserController {

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    private String getUserById(@PathVariable String id) {
        String uri = "http://localhost:8089/api/users/"+id;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
}
