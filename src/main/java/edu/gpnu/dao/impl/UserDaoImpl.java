package edu.gpnu.dao.impl;

import edu.gpnu.dao.IUserDao;
import edu.gpnu.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao  {
    private SqlSessionFactory factory;
    public  UserDaoImpl(SqlSessionFactory factory)
    {
        this.factory=factory;
    }

    public List<User> findAll() {
    //1.使用工厂创建session对象
        SqlSession session=factory.openSession();
        //2.使用session执行查询方法
        List<User> users =session.selectList("edu.gpnu.dao.IUserDao.findAll");
        session.close();
        return users;
    }
}
