package com.example.homew3_testingmockito.Service;
import com.example.homew3_testingmockito.DAO.UserDaoImpl;
import com.example.homew3_testingmockito.Model.User;

public class UserService {
    public UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user){
        return userDao.getUserByName(user.getName()) != null;
    }
}