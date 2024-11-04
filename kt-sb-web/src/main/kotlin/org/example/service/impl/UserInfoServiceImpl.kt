package org.example.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import lombok.extern.slf4j.Slf4j
import org.example.dao.UserInfoDao
import org.example.model.UserInfo
import org.example.service.UserInfoService
import org.springframework.stereotype.Service

@Service
@Slf4j
open class UserInfoServiceImpl : ServiceImpl<UserInfoDao, UserInfo>() , UserInfoService
