package com.zx.controller;

import com.zx.dto.GoodsDto;
import com.zx.entity.GoodsEntity;
import com.zx.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @PostMapping(value = "insertGoods")
    public Integer insertGoods(@RequestBody GoodsEntity goods) {
        return insertGoods(goods);
    }

    /**
     * 删除商品
     * @param goods_id
     * @return
     */

    @DeleteMapping(value = "deleteByGoodsKey")
    public Integer deleteByGoodsKey(@RequestParam(value = "goods_id") Integer goods_id) {
        return goodsService.deleteByGoodsKey(goods_id);
    }

    /**
     * 修改商品
     * @param goods
     * @return
     */
    @PutMapping(value = "updateByGoodsKey")
    public Integer updateByGoodsKey(@RequestBody GoodsEntity goods) {
        return goodsService.updateByGoodsKey(goods);
    }

    /**
     * 分页查询
     * @param startIndex,pageSize
     * @return
     */
    @GetMapping(value = "selectForPage")
    public List<GoodsDto> selectForPage(@RequestParam(value = "startIndex") Integer startIndex,
                                        @RequestParam(value = "pageSize") Integer pageSize) {
        return goodsService.selectForPage(startIndex,pageSize);
    }


}
