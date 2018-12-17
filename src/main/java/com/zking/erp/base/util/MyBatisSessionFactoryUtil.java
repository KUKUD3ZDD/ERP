package com.zking.erp.base.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisSessionFactoryUtil {
    public static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<SqlSession>();

    static{
        try {
            InputStream is=MyBatisSessionFactoryUtil.class.getResourceAsStream("/mybatis.cfg.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(){
        SqlSession sqlSession = threadLocal.get();
        if(null==sqlSession){
            sqlSession=sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSession(){
        SqlSession sqlSession = threadLocal.get();
        if(null!=sqlSession){
            threadLocal.set(null);
            sqlSession.close();
        }
    }

    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisSessionFactoryUtil.openSession();
        System.out.println(sqlSession);
        System.out.println(sqlSession.getConnection());
        System.out.println("连接以打开!!!");
        System.out.println("连接已关闭...");

    }
}
