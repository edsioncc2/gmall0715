package com.atguigu.gmall0715.order.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class UserInfo {
    //属性
    @Id//表示主键
    @Column//字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 表示获取主键自增！
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
