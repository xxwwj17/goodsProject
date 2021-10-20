package com.zx.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GoodsDto implements Serializable {

    /**
     * 商品编码
     */
    private Integer goods_id;
    /**
     * 商品名称
     */
    private String goods_name;
    /**
     * 品牌编码
     */
    private BigDecimal brank_id;
    /**
     * 品牌名称
     */
    private String brank_name;

}
