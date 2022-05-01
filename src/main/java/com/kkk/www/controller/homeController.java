package com.kkk.www.controller;

import com.kkk.www.sevice.UserInfoService;
import com.kkk.www.sevice.UserInfoServiceImpl;
import com.kkk.www.vo.UserInfoVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class homeController {
    protected Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/home")
    public String home(){
        logger.debug("[debug] log!");
        logger.info("[info] log!");
        logger.warn("[warn] log!");
        logger.error("[error] log!");
        //UserInfoVO userInfoVO = userInfoService.selectUserInfo("kkk");
        return "home/home";
    }
}
