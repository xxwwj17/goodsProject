package com.zx.service.impl;


import com.zx.dao.BrankDao;
import com.zx.dao.GoodsDao;
import com.zx.dto.GoodsDto;
import com.zx.entity.BrankEntity;
import com.zx.entity.GoodsEntity;
import com.zx.service.GoodsService;
import com.zx.util.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private BrankDao brankDao;

    @Override
    public List<GoodsDto> selectForPage(Integer startIndex, Integer pageSize) {
        List<GoodsEntity> list = goodsDao.selectForPage(startIndex,pageSize);
        List<GoodsDto> goodsDtoList = ConvertUtils.sourceToTarget(list, GoodsDto.class);
        goodsDtoList.forEach(entity -> {
            BrankEntity brank = brankDao.selectByBrankKey(entity.getBrank_id().intValue());
            entity.setBrank_name(brank.getBrank_name());
        });
        return goodsDtoList;
    }

    @Override
    public int insertGoods(GoodsEntity goods) {
        return goodsDao.insertGoods(goods);
    }


    @Override
    public int deleteByGoodsKey(Integer goods_id) {
        return goodsDao.deleteByGoodsKey(goods_id);
    }

    @Override
    public int updateByGoodsKey(GoodsEntity goods) {
        return goodsDao.updateByGoodsKey(goods);
    }

}
