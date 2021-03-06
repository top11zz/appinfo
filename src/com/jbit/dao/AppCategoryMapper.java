package com.jbit.dao;

import com.jbit.entity.AppCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppCategoryMapper {
    List<AppCategory> findAppList( Long parentid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int insert(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int insertSelective(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    AppCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppCategory record);
}