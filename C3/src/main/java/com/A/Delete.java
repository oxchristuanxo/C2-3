package com.A;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public  class Delete {
    public static  void deletecoun(String country) throws IOException {

        InputStream inputStream =
                Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造SQLSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //构造SQLSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执⾏删除语句
        sqlSession.delete("UserMapper.deletecoun", country);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    public static  void deletearea(String id) throws IOException {

        InputStream inputStream =
                Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造SQLSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //构造SQLSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执⾏删除语句
        sqlSession.delete("UserMapper.deletearea", id);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
