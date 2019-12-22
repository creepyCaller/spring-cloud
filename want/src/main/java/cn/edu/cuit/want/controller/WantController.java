package cn.edu.cuit.want.controller;


import cn.edu.cuit.want.entity.Want;
import cn.edu.cuit.want.service.WantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author fpc
 * create on 2019-12-22 16:46:10
 */
@RestController
@RequestMapping("/want")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WantController {
    private final WantService service;

    @GetMapping("/{id}")
    public ResponseEntity<Want> selectOne(@PathVariable Integer id) {
        return ResponseEntity
                .ok()
                .body(service.selectOne(id));
    }

    @PutMapping("/")
    public ResponseEntity<Want> insert(@RequestBody Want want) {
        return ResponseEntity
                .ok()
                .body(service.insert(want));
    }
    
}