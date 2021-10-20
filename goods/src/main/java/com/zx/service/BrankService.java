package com.zx.service;

import com.zx.entity.BrankEntity;

import java.util.List;

public interface BrankService {
    /**
     * 获取品牌信息
     * @param brank_id
     * @return
     */
    List<BrankEntity> selectByBrankKey(Integer brank_id);
}
