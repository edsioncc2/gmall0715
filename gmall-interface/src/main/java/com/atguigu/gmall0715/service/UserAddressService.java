package com.atguigu.gmall0715.service;

import com.atguigu.gmall0715.bean.UserAddress;

import java.util.List;

//业务层接口
public interface UserAddressService {
    /**
     * 根据用户Id查询用户的地址列表
     */
    List<UserAddress> findUserAddressByUserId(String userId);
}
