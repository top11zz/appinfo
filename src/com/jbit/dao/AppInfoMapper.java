package com.jbit.dao;

import com.jbit.entity.AppInfo;

public interface AppInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    int insert(AppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    int insertSelective(AppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    AppInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppInfo record);
}