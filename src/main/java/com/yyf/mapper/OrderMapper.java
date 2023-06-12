package com.yyf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyf.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
