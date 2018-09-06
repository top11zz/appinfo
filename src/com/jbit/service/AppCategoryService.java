package com.jbit.service;

import com.jbit.entity.AppCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/9/5.
 */
public interface AppCategoryService {
    List<AppCategory> findAppList(Long parentid);
}
