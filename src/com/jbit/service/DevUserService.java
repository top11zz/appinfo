package com.jbit.service;

import com.jbit.entity.DevUser;

/**
 * Created by Administrator on 2018/9/4.
 */
public interface DevUserService {
    DevUser findloginUser(String devcode, String devpassword);

}
