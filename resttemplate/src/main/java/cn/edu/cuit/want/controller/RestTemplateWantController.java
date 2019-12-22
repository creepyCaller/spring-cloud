package cn.edu.cuit.want.controller;

import cn.edu.cuit.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/want")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RestTemplateWantController {
    private final RestTemplate restTemplate;

    @GetMapping("/{id}")
    public ResponseEntity<Want> selectOne(@PathVariable String id) {
        return restTemplate.getForEntity("http://localhost:8082/want/{id}", /*Body的类型*/ Want.class, id); //返回一个ResponseEntity<User>
    }

}
