package org.example.api;

import jakarta.servlet.http.HttpServletRequest;
import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserApi {
    @GetMapping("/list")
    public Object list(User user){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","你好");
        map.put("data",user);
        return map;
    }

    @RequestMapping("/insert")
    public Object insert(User user, HttpServletRequest request){
        user.setToken(request.getHeader("Token"));
        HashMap<Object, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","你好");
        map.put("data",user);
        return map;
    }
}
