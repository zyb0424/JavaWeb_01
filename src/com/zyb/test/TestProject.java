package com.zyb.test;

import com.zyb.entity.User;
import com.zyb.gongju.GongJu;
import com.zyb.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;


public class TestProject {
    public static void main(String[] args) {
        SqlSession session=GongJu.createSqlSession();
        UserMapper abc=session.getMapper(UserMapper.class);
        User user=abc.zybniua("2005110209");
        System.out.println(user);
    };
}
