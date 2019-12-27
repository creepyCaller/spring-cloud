package cn.edu.cuit.ribbon.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@RequestMapping("/ribbon")
public class UserController {
    private final RestTemplate restTemplate;

    @GetMapping("/users")
    public ResponseEntity findAll() {
        return restTemplate.getForEntity("http://UserProvider/users", Collection.class);
    }
}
