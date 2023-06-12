package com.yyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyf.entity.OrderDetail;
import com.yyf.mapper.OrderDetailMapper;
import com.yyf.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
