package org.example.api

import org.example.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
class UserApi {

    @GetMapping("/list")
    fun list() = User("张三", 18, "123456")

    @RequestMapping("/update")
    fun update(user: User) = user

}
