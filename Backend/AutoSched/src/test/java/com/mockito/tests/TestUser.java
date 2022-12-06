package com.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.example.AutoSched.GroupObj.GroupObjService;
import com.example.AutoSched.HttpBodies.SessionId;
import com.example.AutoSched.User.UserController;
import com.example.AutoSched.User.UserService;
import com.example.AutoSched.User.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


public class TestUser {

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    @Mock
    GroupObjService groupObjService;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllData() {
        List<User> list = new ArrayList<User>();
        list.add(new User("liam", "liam_password"));
        list.add(new User("vincent", "vincent_password"));
        list.add(new User("chase", "chase_password"));
        when(userService.findAll()).thenReturn(list);
        List<User> list1 = userController.getAllData();
        assertEquals(3, list1.size());
    }

    @Test
    public void delUser() throws NoSuchAlgorithmException {
        User user = new User(1, "liam", "password");
        user.hashPassword(user.getPassword());
        SessionId s = new SessionId(1);
        user.updateSessionExpire();
        when(userService.findById(1)).thenReturn(user);
        int i = 0;
        user.setSessionId(s.getSessionid());
        String str = userController.delUser(1,s);
        assertEquals("{\"code\":0,\"message\":\"success\"}", str);
    }





    }
