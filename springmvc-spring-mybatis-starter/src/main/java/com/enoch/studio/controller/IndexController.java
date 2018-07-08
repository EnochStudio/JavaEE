package com.enoch.studio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Enoch on 2018/4/28.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index.jsp";
    }
}
