package com.sky.springboot.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class Department implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    @ApiModelProperty("部门ID")
    private Integer id;
    @ApiModelProperty("部门名称")
    private String departmentName;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
