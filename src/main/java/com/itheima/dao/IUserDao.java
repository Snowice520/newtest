package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author Snowice
 * @date 2020/2/18 - 18:34
 * 用户类的持久层接口
 */
public interface IUserDao {
    //查询所有操作
    public List<User> findAll();
}
