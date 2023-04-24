package com.example.homew3_testingmockito.Service;
import com.example.homew3_testingmockito.DAO.UserDaoImpl;
import com.example.homew3_testingmockito.Model.User;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    UserService userService;
    @Mock
    public UserDaoImpl userDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void checkUserExistNull() {
        Mockito.when(userDao.getUserByName("Алексей")).thenReturn(null);
        Assertions.assertFalse(userService.checkUserExist(new User("Алексей")));
    }
    @Test
    public void checkUserExistNotNull() {
        Mockito.when(userDao.getUserByName("Павелан")).thenReturn(new User("Павелан"));
        Assertions.assertNotNull(userService.checkUserExist(new User("Павелан")));
    }
}