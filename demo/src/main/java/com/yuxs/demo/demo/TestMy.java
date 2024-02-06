package com.yuxs.demo.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class TestMy {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
