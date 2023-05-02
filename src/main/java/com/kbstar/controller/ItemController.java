package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tables")
public class ItemController {

    @RequestMapping("")
    public String main(Model model) {
        return null;
    };


    }


