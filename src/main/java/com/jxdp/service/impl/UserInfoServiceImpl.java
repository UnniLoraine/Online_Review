package com.jxdp.service.impl;

import com.jxdp.entity.UserInfo;
import com.jxdp.mapper.UserInfoMapper;
import com.jxdp.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
