package edu.gpnu.dao;

import edu.gpnu.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao  {

    List<User> findAll();
}
