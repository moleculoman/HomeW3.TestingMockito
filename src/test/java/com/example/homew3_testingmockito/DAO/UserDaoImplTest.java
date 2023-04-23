package com.example.homew3_testingmockito.DAO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoImplTest {
    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    public void getUserByName(String name) {
        Assertions.assertNotNull(userDao.getUserByName("Петр"));
    }

    @Test
    void getNullByName() {
        Assertions.assertNull(userDao.getUserByName("АлексSsй"));
    }
}