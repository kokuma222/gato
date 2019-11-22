package com.zzz.dao;

import com.zzz.entity.User;

public interface UserDao {

    /**
     * 新增用户
     * */
    public int insertUser(User user) throws Exception;

    /**
     * 根据 no 查询用户信息
     * */
    public User selectUserByNo(String no) throws Exception;
}
