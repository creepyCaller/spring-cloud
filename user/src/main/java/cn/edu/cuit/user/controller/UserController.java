package cn.edu.cuit.user.controller;

import cn.edu.cuit.user.entity.User;
import cn.edu.cuit.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {
    private final UserService service;

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public ResponseEntity port() {
        return ResponseEntity.ok().body(port);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> selectOne(@PathVariable Integer id) {
        return ResponseEntity.ok().body(service.selectOne(id));
    }

    @PutMapping("/")
    public ResponseEntity insert(@RequestBody User user) {
        return ResponseEntity.ok().body(service.insert(user));
    }

    @GetMapping("/users")
    public ResponseEntity findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

}