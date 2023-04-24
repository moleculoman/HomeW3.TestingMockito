package com.example.homew3_testingmockito.DAO;
import com.example.homew3_testingmockito.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {
    ArrayList<User> userList;

    public UserDaoImpl() {
        this.userList = new ArrayList<>();
        userList.add(new User("Алексей"));
        userList.add(new User("Дмитрий"));
        userList.add(new User("Елена"));
    }
    public User getUserByName(String name){
        for (User user : userList) {
            if (user.getName().equals(name))
                return user;
        }
        return null;
    }
    public List<User> findAllUser(){
        return userList;
    }
}