package com.zzz.service;

import com.zzz.dao.UserDao;
import com.zzz.entity.User;
import com.zzz.util.UserUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    public static void main(String[] args) {
        selectUserByNo();
    }

    private static void selectUserByNo() {
        SqlSession session = UserUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        try {
            User user = userDao.selectUserByNo("0001");
            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
