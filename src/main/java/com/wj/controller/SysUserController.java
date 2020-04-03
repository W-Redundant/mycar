package com.wj.controller;

import com.wj.pojo.SysUser;
import com.wj.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/selAll")
    public List<SysUser> selALLSysUser(){
        return sysUserService.selAllSysUser(null);
    }
}
