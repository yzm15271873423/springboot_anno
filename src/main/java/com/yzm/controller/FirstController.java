package com.yzm.controller;

import com.yzm.pojo.User;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yzm
 * @Date: 2021/5/25 - 05 - 25 - 21:36
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class FirstController {

    @RequestMapping("index")
    public String show(){
        return "index";
    }
}
