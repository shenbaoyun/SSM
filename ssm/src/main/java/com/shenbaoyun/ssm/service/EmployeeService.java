package com.shenbaoyun.ssm.service;

import com.github.pagehelper.PageInfo;
import com.shenbaoyun.ssm.pojo.Employee;

import java.util.List;

/**
 * @author shenbaoyun
 * @create 2022-09-22 10:40
 */
public interface EmployeeService {
    List<Employee> getAllEmployee();

    /**
     * 配置员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
