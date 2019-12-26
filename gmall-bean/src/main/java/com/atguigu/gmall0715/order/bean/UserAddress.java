package com.atguigu.gmall0715.order.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
@Data
public class UserAddress {
    @Column
    @Id
    private String id;
    @Column
    private String userAddress;
    @Column
    private String userId;
    @Column
    private String consignee;
    @Column
    private String phoneNum;
    @Column
    private String isDefault;
}
