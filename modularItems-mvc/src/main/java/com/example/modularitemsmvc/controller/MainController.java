package com.example.modularitemsmvc.controller;

import com.example.modularitems.common.TestCommonClass;
import com.example.modularitems.common.repository.UserRepository;
import com.example.modularitems.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String main() {
        String kuku = TestCommonClass.kuku();
        return "home";
    }

}
