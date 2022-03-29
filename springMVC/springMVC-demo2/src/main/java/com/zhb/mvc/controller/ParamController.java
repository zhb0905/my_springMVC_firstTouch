package com.zhb.mvc.controller;

import com.zhb.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

    //1、通过ServletAPI获取
    //将HttpServletRequest作为控制器方法的形参，此时HttpServletRequest类型的参数表示封装了当前请求的请求报文的对象
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"\t"+password);
        return "test_param";
    }

//    ### 2、通过控制器方法的形参获取请求参数
//
//    在控制器方法的形参位置，设置和请求参数同名的形参，当浏览器发送请求，匹配到请求映射时，在DispatcherServlet中就会将请求参数赋值给相应的形参

    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }


//        > 注：
//            >
//            > 若请求所传输的请求参数中有多个同名的请求参数，此时可以在控制器方法的形参中设置字符串数组或者字符串类型的形参接收此请求参数
//>
//        > 若使用字符串数组类型的形参，此参数的数组中包含了每一个数据
//>
//        > 若使用字符串类型的形参，此参数的值为每个数据中间使用逗号拼接的结果


    @RequestMapping("/testpojo")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }
//最终结果-->User{id=null, username='张三', password='123', age=23, sex='男', email='123@qq.com'}

}
