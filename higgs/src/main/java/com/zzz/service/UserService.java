package com.zzz.service;

import com.zzz.dao.UserDao;
import com.zzz.entity.User;
import com.zzz.util.UserUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    public static void main(String[] args) {
        selectUserByNo();
        insertUser();
    }

    private static void selectUserByNo() {
        SqlSession session = UserUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        try {
            User user = userDao.selectUserByNo("0001");
            System.out.println(user.getnAme());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertUser() {
        SqlSession session = UserUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);

        User user = new User();
        user.setnO("0003");
        user.setnAme("fff");
        user.setpAssword("333");

        try {
            userDao.insertUser(user);
            System.out.println("Success !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
