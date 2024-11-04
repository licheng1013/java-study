package org.example.api

import org.example.model.UserInfo
import org.example.service.UserInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/info")
class UserInfoApi {

    @Autowired
    lateinit var userInfoService: UserInfoService

    @GetMapping("/list")
    fun list() = userInfoService.list()

    @RequestMapping("/update")
    fun update(user: UserInfo) = user

}
