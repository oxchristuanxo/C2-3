package com.A;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Add {
    public static void insertTest(Country a) throws IOException {
        //加载核⼼配置⽂件 SqlMapConfig.xml
        InputStream inputStream =
                Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造SQLSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);

        //构造SQLSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执⾏插⼊语句

        //参数⼀: 要执⾏的sql [ 名称空间.id ]
        //参数⼆: 传⼊到sql的参数
        int count = sqlSession.insert("UserMapper.insertCoun", a);
        System.out.println("user表增加的⾏数: " + count);

        //user对象, 已经存⼊到数据库中, 说明user的属性id值 已经有啦, 打印⼀下id值
        System.out.println("user Id值 = " + a.getCountry());
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    public static void insertarea(Area a) throws IOException {
        //加载核⼼配置⽂件 SqlMapConfig.xml
        InputStream inputStream =
                Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造SQLSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);

        //构造SQLSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执⾏插⼊语句

        //参数⼀: 要执⾏的sql [ 名称空间.id ]
        //参数⼆: 传⼊到sql的参数
        int count = sqlSession.insert("UserMapper.insertArea", a);
        System.out.println("user表增加的⾏数: " + count);

        //user对象, 已经存⼊到数据库中, 说明user的属性id值 已经有啦, 打印⼀下id值
        System.out.println("user Id值 = " + a.getLat());
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
