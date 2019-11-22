package com.zzz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class UserUtil {
    private static SqlSessionFactory sessionFactory;

    static {
        try {
            // 使用 MyBatis 提供的 Resources 类加载 mybatis 配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            // 构建 sqlSession 工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }
}
