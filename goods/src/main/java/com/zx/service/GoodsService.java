package com.zx.service;

import com.zx.dto.GoodsDto;
import com.zx.entity.GoodsEntity;

import java.util.List;

public interface GoodsService {
    /**
     * 获取分页数据
     * @param
     * @return
     */
    List<GoodsDto> selectForPage(Integer startIndex, Integer pageSize);

    /**
     * 删除商品数据
     * @param goods_id
     * @return
     */
    int deleteByGoodsKey(Integer goods_id);

    /**
     * 插入商品数据
     * @param goods
     * @return
     */
    int insertGoods(GoodsEntity goods);

    /**
     * 修改商品数据
     * @param goods
     * @return
     */
    int updateByGoodsKey(GoodsEntity goods);
}
