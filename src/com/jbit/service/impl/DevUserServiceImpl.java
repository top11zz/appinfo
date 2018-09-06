package com.jbit.service.impl;

import com.jbit.dao.DevUserMapper;
import com.jbit.entity.DevUser;
import com.jbit.service.DevUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/4.
 */
@Service("DevUserService")
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper devUserMapper;
    @Override
    public DevUser findloginUser(String devcode, String devpassword) {
        return devUserMapper.findloginUser(devcode,devpassword);
    }
}
