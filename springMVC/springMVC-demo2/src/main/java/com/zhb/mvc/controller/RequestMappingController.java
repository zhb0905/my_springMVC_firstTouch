package com.zhb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
//    注：
//
//            1、对于处理指定请求方式的控制器方法，SpringMVC中提供了@RequestMapping的派生注解
//
//    处理get请求的映射-->@GetMapping
//
//    处理post请求的映射-->@PostMapping
//
//    处理put请求的映射-->@PutMapping
//
//    处理delete请求的映射-->@DeleteMapping
//
//2、常用的请求方式有get，post，put，delete
//
//    但是目前浏览器只支持get和post，若在form表单提交时，为method设置了其他请求方式的字符串（put或delete），则按照默认的请求方式get处理
//
//    若要发送put和delete请求，则需要通过spring提供的过滤器HiddenHttpMethodFilter，在RESTful部分会讲到
    @RequestMapping(value =
            {"/testRequestMapping","/test"},
            method = {RequestMethod.GET}
    )
    public String index() {
        return "success";
    }
    @RequestMapping(
            value = ("/testParam"),
            params = ("username")
    )
    public String testParam(){
        return "success";
    }
    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id,@PathVariable("username") String username) {
        System.out.println(id+username);
        return "success";

    }
}
