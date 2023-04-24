package com.example.homew3_testingmockito.DAO;

import com.example.homew3_testingmockito.Model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoImplTest {
    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void getUserByName() {
        Assertions.assertNotNull(userDao.getUserByName("Алексей"));
    }

    @Test
    void getNullByName() {
        Assertions.assertNull(userDao.getUserByName("АлексSsй"));
    }
}