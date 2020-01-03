package com.atguigu.gmall0715.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0715.bean.SkuInfo;
import com.atguigu.gmall0715.bean.SpuImage;
import com.atguigu.gmall0715.bean.SpuSaleAttr;
import com.atguigu.gmall0715.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SkuManageController {
    @Reference
    private ManageService manageService;
    // http://localhost:8082/spuImageList?spuId=60
    @RequestMapping("spuImageList")
     public List<SpuImage> getSpuImageList(String spuId,SpuImage spuImage) {
        return manageService.getSpuImageList(spuImage);
    }
    // 通过spuId 查询销售属性-销售属性值
    // http://localhost:8082/spuSaleAttrList?spuId=6
    @RequestMapping("spuSaleAttrList")
    public  List<SpuSaleAttr> getSpuSaleAttrList(String spuId){
        return manageService.getSpuSaleAttrList(spuId);
    }
    // http://localhost:8082/saveSkuInfo
    // json ---> javaObject
    @RequestMapping("saveSkuInfo")
    public void saveSkuInfo(@RequestBody SkuInfo skuInfo){
        manageService.saveSkuInfo(skuInfo);
    }
}

