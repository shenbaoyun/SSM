package com.shenbaoyun.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.shenbaoyun.ssm.pojo.Employee;
import com.shenbaoyun.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author shenbaoyun
 * @create 2022-09-22 10:20
 * <p>
 * 查询所有的员工信息        /employee -->get
 * 查询员工分页信息       /employee/1 -->get
 * 根据ID查询员工信息       /employee/page/1 -->get
 * 跳转到添加页面          /to/add -->get
 * 添加员工信息           /employee -->post
 * 修改员工信息           /employee-->put
 * 删除员工信息           /employee/1-->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model) {
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page", page);
        //跳转到
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list", list);
        //跳转到
        return "employee_list";

    }


}
