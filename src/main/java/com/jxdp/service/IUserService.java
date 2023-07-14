package com.jxdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxdp.dto.LoginFormDTO;
import com.jxdp.dto.Result;
import com.jxdp.entity.User;

import javax.servlet.http.HttpSession;


public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
