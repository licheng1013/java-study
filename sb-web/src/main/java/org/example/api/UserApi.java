package org.example.api;

import jakarta.servlet.http.HttpServletRequest;
import org.example.model.Result;
import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserApi {

    @GetMapping("/list")
    public Object list(User user){
        user.setName("LIST");
        user.setAge(101);
        return user;
    }

    @RequestMapping("/insert")
    public Object insert(User user, HttpServletRequest request){
        user.setToken(request.getHeader("Token"));
        user.setName("测试");
        user.setAge(20);
        return user;
    }

    // 错误示例
    @RequestMapping("/error")
    public Object error(){
        throw new RuntimeException("Hello error");
    }
}
