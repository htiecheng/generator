package com.htc.generator.mapper;

import com.htc.generator.pojo.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(User record);

    User selectByPrimaryKey(String uid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}