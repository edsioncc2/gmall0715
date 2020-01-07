package com.atguigu.gmall0715.manage.mapper;

import com.atguigu.gmall0715.bean.BaseAttrInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo>{
    // 通过三级分类Id 查询
    List<BaseAttrInfo> selectBaseAttrInfoListByCatalog3Id(String catalog3Id);
    // 通过平台属性值Id 查询平台属性集合
    // SELECT * FROM  base_attr_info bai INNER  JOIN base_attr_value bav ON bai.id=bav.attr_id WHERE bav.id in (83,120,13);
    List<BaseAttrInfo> selectAttrInfoListByIds(@Param("valueIds")String valueIds);
}
