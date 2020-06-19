package com.lk.dao;

import com.lk.model.Login;
import com.lk.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Hieu");
        u1.setAccount("leeken");
        u1.setEmail("leeken@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Teo");
        u2.setAccount("hieuteo");
        u2.setEmail("hieuteo@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Chuoi");
        u3.setAccount("maicoteo");
        u2.setEmail("maicoteo@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User user: users) {
            if(user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
