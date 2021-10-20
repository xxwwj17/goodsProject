package com.zx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("s_goods")
public class GoodsEntity implements Serializable {

    /**
     * 商品编码
     */
    private Integer goods_id;

    /**
     * 品牌编码
     */
    private BigDecimal brank_id;

    /**
     * 商品名称
     */
    private String goods_name;

}
