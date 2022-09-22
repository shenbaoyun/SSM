package com.shenbaoyun.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenbaoyun.ssm.mapper.EmployeeMapper;
import com.shenbaoyun.ssm.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author shenbaoyun
 * @create 2022-09-22 10:40
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,5);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list,5);
        return page;
    }
}
