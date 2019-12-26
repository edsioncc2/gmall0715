package com.atguigu.gmall0715.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0715.order.bean.UserAddress;
import com.atguigu.gmall0715.order.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrederController {
    @Reference
    private UserService userService;
    /**
     * 根据用户Id查询收货地址列表
     */
    @RequestMapping("trade")
    public List<UserAddress> trade(String userId){

        return userService.findUserAddressByUserId(userId);
    }
}
