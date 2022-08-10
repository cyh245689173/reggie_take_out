package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @auther xiaochen
 * @create 2022-08-07 11:15
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
