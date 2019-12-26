package com.atguigu.gmall0715.order.service;

import com.atguigu.gmall0715.order.bean.UserAddress;
import com.atguigu.gmall0715.order.bean.UserInfo;

import java.util.List;
//业务层接口
public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();
    /**
     * 根据用户Id查询用户的地址列表
     */
    List<UserAddress> findUserAddressByUserId(String userId);
}
