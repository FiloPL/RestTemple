package com.filo.resttemple.services;

import com.filo.resttemple.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T. Filo Zegarlicki on 03.05.2022
 **/

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;


    @BeforeEach
    void setUp() {
    }

//    @Test
//    public void testGetUsers() throws Exception {
//        List<User> users = apiService.getUsers(3);
//        assertEquals(4, users.size());
//    }
}