package com.sky.springboot.controller;


import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.sky.springboot.bean.Department;
import com.sky.springboot.bean.Employee;
import com.sky.springboot.mapper.DepartmentMapper;
import com.sky.springboot.mapper.EmployeeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "1.1",description = "SWAGGER测试",value = "SWAGGER测试")
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    @ApiOperation(value = "主键查询（DONE）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "部门编号", dataType = ApiDataType.LONG, paramType = ApiParamType.PATH),
    })
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
       return employeeMapper.getEmpById(id);
    }


}
