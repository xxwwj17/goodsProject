package com.zx.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("s_brank")
public class BrankEntity {

    /**
     * 品牌编码
     */
    private BigDecimal brank_id;

    /**
     * 品牌名称
     */
    private String brank_name;
}
