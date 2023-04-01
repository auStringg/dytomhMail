package com.dytomh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dytomh.common.utils.PageUtils;
import com.dytomh.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-22 20:48:16
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

