package org.example.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.example.dao.UserInfoDao
import org.example.entity.UserInfo
import org.example.service.UserInfoService
import org.springframework.stereotype.Service

@Service
open class UserInfoServiceImpl : ServiceImpl<UserInfoDao, UserInfo>() , UserInfoService
