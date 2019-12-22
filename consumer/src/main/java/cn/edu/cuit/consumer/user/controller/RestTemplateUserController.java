package cn.edu.cuit.consumer.user.controller;

import cn.edu.cuit.consumer.user.entity.User;
import cn.edu.cuit.consumer.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RestTemplateUserController {
    private final RestTemplate restTemplate;

    @GetMapping("/{username}")
    public ResponseEntity<User> selectOne(@PathVariable String username) {
        return restTemplate.getForEntity("http://localhost:8081/user/{username}", /*Body的类型*/ User.class, username); //返回一个ResponseEntity<User>
    }

    @PutMapping("/")
    public void insert(@RequestBody User user) {
        restTemplate.put("http://localhost:8081/user", user);
    }

}
