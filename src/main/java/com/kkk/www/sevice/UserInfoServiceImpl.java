package com.kkk.www.sevice;

import com.kkk.www.dao.UserInfoDAO;
import com.kkk.www.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public UserInfoVO selectUserInfo(String userId) {
        return userInfoDAO.selectUserInfo(userId);
    }
}
