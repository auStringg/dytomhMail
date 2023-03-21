package com.dytomh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dytomh.common.utils.PageUtils;
import com.dytomh.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-21 23:34:49
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

