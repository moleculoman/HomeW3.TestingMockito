package com.example.homew3_testingmockito.Service;
import com.example.homew3_testingmockito.DAO.UserDaoImplTest;
import com.example.homew3_testingmockito.Model.User;


public class UserServiceTest {
    private UserDaoImplTest userDao;

    public UserServiceTest(UserDaoImplTest userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user){
        if (userDao.getUserByName(user.getName()) == null)
            return false;
        return true;
    }
}