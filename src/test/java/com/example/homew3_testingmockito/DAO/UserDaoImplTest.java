package com.example.homew3_testingmockito.DAO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoImplTest {
    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void getUserByName() {
        Assertions.assertNotNull(userDao.getUserByName("Петр"));
    }

    @Test
    void getNullByName() {
        Assertions.assertNull(userDao.getUserByName("АлексSsй"));
    }
}