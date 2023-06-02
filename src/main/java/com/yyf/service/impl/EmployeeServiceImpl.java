package com.yyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyf.entity.Employee;
import com.yyf.mapper.EmployeeMapper;
import com.yyf.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
