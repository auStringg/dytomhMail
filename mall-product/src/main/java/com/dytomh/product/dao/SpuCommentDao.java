package com.dytomh.product.dao;

import com.dytomh.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-21 23:34:49
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
