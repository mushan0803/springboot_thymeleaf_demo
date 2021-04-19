package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller     //注意：如果使用Thymeleaf模板引擎，必须使用controller注解
public class TestThymeleafController {

    @RequestMapping("/index01")
    public String index01(Model model){
        model.addAttribute("message", "hello");
        return "index01";  //要跳转的页面路径
    }

    @RequestMapping("/index02")
    public String index02(Model model){
        User user = new User();
        user.setId(1L);
        user.setName("小凡");
        user.setAge(23);
        model.addAttribute("message", user);

        Map map =new HashMap();
        map.put("id", "2");
        map.put("name","小游");
        map.put("age", "18");
        model.addAttribute("message", map);
        return "index02";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag", "yes");

        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index05";  //要跳转的页面路径
    }
}
