package cn.edu.cuit.consumer.user.controller;

import cn.edu.cuit.consumer.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RestTemplateUserController {
    private final RestTemplate restTemplate;

    @GetMapping("/user/id/{id}")
    public ResponseEntity<User> selectOne(@PathVariable Integer id) {
        return restTemplate.getForEntity("http://localhost:8090/user/id/{id}", /*Body的类型*/ User.class, id); //返回一个ResponseEntity<User>
    }

    @PutMapping("/")
    public void insert(@RequestBody User user) {
        restTemplate.put("http://localhost:8090/user/", user);
    }

    @GetMapping("/user/users")
    public ResponseEntity findAll() {
        return restTemplate.getForEntity("http://localhost:8090/user/users", ArrayList.class);
    }

}
