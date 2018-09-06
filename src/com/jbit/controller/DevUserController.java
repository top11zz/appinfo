package com.jbit.controller;

import com.jbit.entity.DevUser;
import com.jbit.service.AppCategoryService;
import com.jbit.service.DataDictionaryService;
import com.jbit.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/9/4.
 */
@Controller
@RequestMapping("/devuser")
public class DevUserController {
    @Resource
    private DevUserService devUserService;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(String devcode, String devpassword, Model model, HttpSession session){
        System.out.println(devcode);
        System.out.println(devpassword);
        DevUser user = devUserService.findloginUser(devcode,devpassword);
        if(user!=null){
            session.setAttribute("user",user);
            return "jsp/developer/main";
        }else {
            model.addAttribute("error","用户名或密码错误！");
            return "jsp/devlogin";
        }
    }
    @RequestMapping("/list")
    public String list(Model model){
         model.addAttribute("statusList",dataDictionaryService.findAppStaus());
        model.addAttribute("flatFormList",dataDictionaryService.findAppFlatform());
        model.addAttribute("categoryLevel1List",appCategoryService.findAppList(0L));
        return "jsp/developer/appinfolist";
    }
}
