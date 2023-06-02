package com.yyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyf.entity.Setmeal;
import com.yyf.mapper.SetmealMapper;
import com.yyf.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper,Setmeal> implements SetmealService {
}
