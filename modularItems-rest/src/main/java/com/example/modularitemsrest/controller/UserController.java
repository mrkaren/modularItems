package com.example.modularitemsrest.controller;

import com.example.modularitems.common.TestCommonClass;
import com.example.modularitems.common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public void user(){
        String kuku = TestCommonClass.kuku();
        System.out.println(kuku);
    }

}
