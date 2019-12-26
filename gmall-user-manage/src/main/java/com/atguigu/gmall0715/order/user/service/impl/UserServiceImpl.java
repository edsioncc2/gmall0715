package com.atguigu.gmall0715.order.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0715.order.bean.UserAddress;
import com.atguigu.gmall0715.order.bean.UserInfo;
import com.atguigu.gmall0715.order.user.mapper.UserInfoMapper;
import com.atguigu.gmall0715.order.service.UserService;
import com.atguigu.gmall0715.order.user.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired(required = false)
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
        // return userAddressMapper.select(new UserAddress().setUserId(userId));
    }
}
