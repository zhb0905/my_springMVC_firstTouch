package com.zhb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
