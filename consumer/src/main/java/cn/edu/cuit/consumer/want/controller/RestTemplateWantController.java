package cn.edu.cuit.consumer.want.controller;

import cn.edu.cuit.consumer.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

@RestController
@RequestMapping("/want")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RestTemplateWantController {
    private final RestTemplate restTemplate;

    @GetMapping("/{id}")
    public ResponseEntity<Want> selectOne(@PathVariable String id) {
        return restTemplate.getForEntity("http://localhost:8090/want/id/{id}", /*Body的类型*/ Want.class, id); //返回一个ResponseEntity<User>
    }

    @PutMapping("/")
    public void insert(@RequestBody Want want) {
        restTemplate.put("http://localhost:8090/want/", want);
    }

    @GetMapping("/want/wants")
    public ResponseEntity findAll() {
        return restTemplate.getForEntity("http://localhost:8090/want/wants", ArrayList.class);
    }

}
