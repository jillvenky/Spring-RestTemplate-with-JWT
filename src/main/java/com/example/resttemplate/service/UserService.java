package com.example.resttemplate.service;

import com.example.resttemplate.model.Student;
import com.example.resttemplate.model.StudentIdentify;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    public String getUserDetail(int id) {
        String token = getToken();
        Student data = new Student(id, null, null, null, null);
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type","application/json");
        headers.add("Authorization",token);
        HttpEntity<Student> entity = new HttpEntity<>(null,headers);
        RestTemplate rest = new RestTemplate();

        ResponseEntity<String> exchange = rest.exchange("http://localhost:8181/api/student", HttpMethod.POST, entity, String.class);
        return exchange.getBody();
    }


    /**
     * Generate token
     * @return
     */
    public String getToken() {
        StudentIdentify data = new StudentIdentify("kritchat","055090323");
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type","application/json");
        HttpEntity<StudentIdentify> entity = new HttpEntity<>(data, headers);

        RestTemplate rest = new RestTemplate();
        ResponseEntity<String> exchange = rest.exchange("http://localhost:8181/login", HttpMethod.POST, entity, String.class);
        String token = exchange.getHeaders().get("authorization").get(0);
        System.out.println(token);
        return token;
    }
}
