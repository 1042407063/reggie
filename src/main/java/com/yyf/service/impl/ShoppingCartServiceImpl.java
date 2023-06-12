package com.yyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyf.entity.ShoppingCart;
import com.yyf.mapper.ShoppingCartMapper;
import com.yyf.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
