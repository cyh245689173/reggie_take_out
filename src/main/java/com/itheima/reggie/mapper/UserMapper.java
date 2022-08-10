package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther xiaochen
 * @create 2022-08-08 16:02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
