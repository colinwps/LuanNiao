package com.colinapp.luanniao.mapper;

import com.colinapp.luanniao.domain.UserList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int addUser(UserList user);

}
