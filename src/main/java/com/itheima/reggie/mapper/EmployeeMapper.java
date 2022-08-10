package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther xiaochen
 * @create 2022-08-05 17:01
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
