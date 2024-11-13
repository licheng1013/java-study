package org.example.api

import org.example.entity.UserInfo
import org.example.service.UserInfoService
import org.example.util.MyException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user/info")
class UserInfoApi {

    @Autowired
    lateinit var userInfoService: UserInfoService

    @GetMapping("/list")
    fun list(): List<UserInfo> = userInfoService.list()

    @PostMapping("/update")
    fun update(user: UserInfo) = userInfoService.updateById(user)

    @PostMapping("/delete")
    fun delete(id: Int) = userInfoService.removeById(id)

    @PostMapping("/insert")
    fun insert(user: UserInfo) = userInfoService.save(user)

    @GetMapping("/error")
    fun error(): Nothing = throw MyException("error")

}
