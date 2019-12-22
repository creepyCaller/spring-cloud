package cn.edu.cuit.user.controller;

import cn.edu.cuit.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
