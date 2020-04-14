package com.wj.service.impl;

import com.github.pagehelper.PageHelper;
import com.wj.dao.SysMenuMapper;
import com.wj.dto.DataGridResult;
import com.wj.dto.QueryDto;
import com.wj.pojo.SysMenu;
import com.wj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public DataGridResult findMenu(QueryDto queryDto) {
        PageHelper.offsetPage(queryDto.getOffset(),queryDto.getLimit());
        List<SysMenu> menuByPage = sysMenuMapper.findMenuByPage(queryDto);
        return null;
    }
}
