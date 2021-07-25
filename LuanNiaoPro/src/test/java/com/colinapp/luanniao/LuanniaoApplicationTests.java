package com.colinapp.luanniao;

import com.colinapp.luanniao.domain.UserList;
import com.colinapp.luanniao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class LuanniaoApplicationTests {

    @Autowired
   UserMapper userMapper;

    @Test
    void contextLoads() {
        UserList my = new UserList();
        my.userAge = 18;
        my.userId = "111";
        my.userName = "colin";
        userMapper.addUser(my);
    }

}
