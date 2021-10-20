package com.zx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.entity.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity>{
    /**
     * 获取分页数据
     * @param
     * @return
     */
    List<GoodsEntity> selectForPage(Integer startIndex, Integer pageSize);

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
