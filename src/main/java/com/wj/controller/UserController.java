package com.wj.controller;

import com.wj.dto.UserDto;
import com.wj.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/sys/login")
    @ResponseBody
    public R login(@RequestBody UserDto userDto){
        System.out.println(userDto.getUsername());
        return R.ok();
    }



}
