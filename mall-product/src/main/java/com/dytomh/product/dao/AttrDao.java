package com.dytomh.product.dao;

import com.dytomh.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-22 20:48:16
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
