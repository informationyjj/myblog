package com.example.blogserver.strategy.context;

import com.example.blogserver.enums.LoginTypeEnum;
import com.example.blogserver.strategy.SocialLoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;


/**
 * 第三方登录策略上下文
 *
 */
@Service
public class SocialLoginStrategyContext {



//    /**
//     * 执行第三方登录策略
//     *
//     * @param data          数据
//     * @param loginTypeEnum 登录枚举类型
//     * @return {@link UserInfoDTO} 用户信息
//     */
//    public UserInfoDTO executeLoginStrategy(String data, LoginTypeEnum loginTypeEnum) {
//        return socialLoginStrategyMap.get(loginTypeEnum.getStrategy()).login(data);
//    }

}
