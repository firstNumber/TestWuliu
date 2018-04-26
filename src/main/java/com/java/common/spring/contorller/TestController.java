package com.java.common.spring.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyongzhen
 * @create 2018-04-26 10:27
 **/
@RestController
public class TestController {
    @GetMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }
}
