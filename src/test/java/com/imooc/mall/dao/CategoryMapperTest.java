package com.imooc.mall.dao;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 陈旺生
 * @date 2020/3/16 19:14
 */
public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void contextLoads(){
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }
    @Test
    public void queryByIdTest(){
        Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }
}