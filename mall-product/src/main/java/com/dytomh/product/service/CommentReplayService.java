package com.dytomh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dytomh.common.utils.PageUtils;
import com.dytomh.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-21 23:34:49
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

