package cn.edu.cuit.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "This is actuator on provider.";
    }


}
