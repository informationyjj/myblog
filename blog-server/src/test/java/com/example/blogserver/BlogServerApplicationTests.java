package com.example.blogserver;

import com.alibaba.nacos.api.naming.pojo.healthcheck.impl.Http;
import com.example.blogserver.Vo.RegistedVo;
import com.example.blogserver.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    HttpServletRequest httpServletRequest;
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

        RegistedVo user = new RegistedVo("2876944236@qq.com", "ะกรื", "111", "234566");
        Boolean registed = userService.registed(user, httpServletRequest);
        System.out.println(registed);
    }

}
