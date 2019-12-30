package com.atguigu.gmall0715.service;

import com.atguigu.gmall0715.bean.*;

import java.util.List;

public interface ManageService {
    /**
     * 表示查询一级分类数据
     * @return
     */
    List<BaseCatalog1> getCatalog1();
    /**
     * 通过一级分类Id 查询二级分类数据
     * @param catalog1Id
     * @return
     */
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    /**
     * 通过二级分类对象来查询数据
     * @param baseCatalog2
     * @return
     */
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);
    /**
     *  通过三级分类属性来查询
     * @param baseCatalog3
     * @return
     */
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);
    /**
     * 通过三级分类Id 查询
     * @param baseAttrInfo
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);
    /**
     * 保存平台属性，平台属性值
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    /**
     * 根据attrId 回显数据
     * @param attrId
     * @return
     */
     List<BaseAttrValue> getArrValueList(String attrId);
    /**
     * 通过attrId 查询baseAttrInfo
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(String attrId);
    /**
     * 通过三级分类Id 查询
     * @param catalog3Id
     * @return
     */
    List<SpuInfo> getSpuInfoList(String catalog3Id);
    /**
     * 查询所有的销售属性
     * @return
     */
    List<BaseSaleAttr> getBaseSaleAttrList();
    /**
     * 保存spuInfo
     * @param spuInfo
     */
    void saveSpuInfo(SpuInfo spuInfo);
}
