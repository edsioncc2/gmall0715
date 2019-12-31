package com.atguigu.gmall0715.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0715.bean.*;
import com.atguigu.gmall0715.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@CrossOrigin
public class ManageController {
    @Reference
    private ManageService manageService;

    // 返回所有的一级分类数据： getCatalog1
    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1() {
        return manageService.getCatalog1();
    }

    // 参数如何得到？
    // @PathVariable 做restful 请求时用的！ @RequestParam = 获取参数 对象传值：传递过来的参数与实体类的属性名称一致！
    // http://localhost:8082/getCatalog2?catalog1Id=2
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id, BaseCatalog2 baseCatalog2) {
        // select * from basecatalog2 where catalog1Id = ?
        // return manageService.getCatalog2(catalog1Id);
        return manageService.getCatalog2(baseCatalog2);

    }
    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id, BaseCatalog3 baseCatalog3) {
        // select * from basecatalog2 where catalog1Id = ?
        return manageService.getCatalog3(baseCatalog3);
    }
    //    http://localhost:8082/attrInfoList?catalog3Id=61
    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> attrInfoList(String catalog3Id,BaseAttrInfo baseAttrInfo){
        return manageService.getAttInfoList(catalog3Id);
    }
    // http://localhost:8082/saveAttrInfo
    // 必须接收前台的数据
    // 页面传递数据是json ，后面接收对象为java的Object 需要数据类型转换 json --- Object
    // @RequestBody json --- Object  @ResponseBody Object -- Json
    @RequestMapping("saveAttrInfo")
    public void saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
        manageService.saveAttrInfo(baseAttrInfo);
    }
    // http://localhost:8082/getAttrValueList?attrId=102
    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue>getAttrValueList(String attrId){
        // select * from baseAttrValue where attrId = ?
        // 功能来讲：
        // return manageService.getAttrValueList(attrId);
        // 业务来讲：先查询baseAttrInfo
        // select * from baseAttrInfo where id = attrId
       BaseAttrInfo baseAttrInfo = manageService.getBaseAttrInfo(attrId);
       return baseAttrInfo.getAttrValueList();
    }

}