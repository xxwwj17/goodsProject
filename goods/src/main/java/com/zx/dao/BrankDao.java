package com.zx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.entity.BrankEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrankDao extends BaseMapper<BrankEntity> {

    /**
     * 获取品牌信息
     * @param
     * @return
     */
    List<BrankEntity> selectByBrankKey(String break_id);

}
