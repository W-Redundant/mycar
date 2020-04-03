package com.wj.service;

import com.wj.pojo.SysUser;
import com.wj.pojo.SysUserExample;

import java.util.List;

public interface SysUserService {
    public List<SysUser> selAllSysUser(SysUserExample example);
}
