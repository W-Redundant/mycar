package com.wj.service;

import com.wj.dto.DataGridResult;
import com.wj.dto.QueryDto;

public interface MenuService {

    public DataGridResult findMenu(QueryDto queryDto);
}
