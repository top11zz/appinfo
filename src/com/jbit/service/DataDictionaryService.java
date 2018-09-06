package com.jbit.service;

import com.jbit.entity.DataDictionary;

import java.util.List;

/**
 * Created by Administrator on 2018/9/5.
 */
public interface DataDictionaryService {
    List<DataDictionary> findAppStaus();
    List<DataDictionary> findAppFlatform();
}
