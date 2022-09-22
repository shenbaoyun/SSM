package com.shenbaoyun.ssm.mapper;

import com.shenbaoyun.ssm.pojo.Employee;

import java.util.List;

/**
 * @author shenbaoyun
 * @create 2022-09-22 10:50
 */
public interface EmployeeMapper {
    List<Employee> getAllEmployee();
}
