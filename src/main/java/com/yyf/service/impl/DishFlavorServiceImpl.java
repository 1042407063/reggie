package com.yyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyf.entity.DishFlavor;
import com.yyf.mapper.DishFlavorMapper;
import com.yyf.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
