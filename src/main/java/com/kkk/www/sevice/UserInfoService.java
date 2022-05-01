package com.kkk.www.sevice;

import com.kkk.www.vo.UserInfoVO;
import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {

    public UserInfoVO selectUserInfo(String userId);

}
