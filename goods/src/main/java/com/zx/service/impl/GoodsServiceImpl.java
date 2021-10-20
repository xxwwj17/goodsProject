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
        String break_id="";
        for (int z = 0;z<list.size();z++) {
            if (z==list.size()-1) {
                break_id="'"+list.get(z).getBrank_id()+"'";
            } else {
                break_id="'"+list.get(z).getBrank_id()+"',";
            }
        }
        List<BrankEntity> branklist = brankDao.selectByBrankKey(break_id);
        List<GoodsDto> goodsDtoList = ConvertUtils.sourceToTarget(list, GoodsDto.class);
        goodsDtoList.forEach(entity -> {
            for (int i = 0;i<branklist.size();i++) {
                if (branklist.get(i).getBrank_id().intValue()==entity.getBrank_id().intValue()) {
                    entity.setBrank_name(branklist.get(i).getBrank_name());
                }
            }
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
