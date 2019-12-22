package cn.edu.cuit.user.controller;

import cn.edu.cuit.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


/**
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {

    @GetMapping("/{username}")
    public ResponseEntity<User> selectOne(@PathVariable String username) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("author", "fpc");
        headers.add("author", "courage");
        headers.add("date", new Date().toString());
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(User.builder().id(1).username(username).email("fpc@creepyCaller.com").build());
    }

}