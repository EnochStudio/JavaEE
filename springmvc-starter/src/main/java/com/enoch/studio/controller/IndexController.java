package com.enoch.studio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Enoch on 2018/4/15.
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String index() {
        System.out.println("index Handler process");
        return "index.jsp";
    }
}
