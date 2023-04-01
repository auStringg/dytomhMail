package com.dytomh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dytomh.common.utils.PageUtils;
import com.dytomh.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-22 20:48:16
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

