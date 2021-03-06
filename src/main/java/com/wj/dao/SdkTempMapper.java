package com.wj.dao;

import com.wj.pojo.SdkTemp;
import com.wj.pojo.SdkTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkTempMapper {
    long countByExample(SdkTempExample example);

    int deleteByExample(SdkTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SdkTemp record);

    int insertSelective(SdkTemp record);

    List<SdkTemp> selectByExample(SdkTempExample example);

    SdkTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SdkTemp record, @Param("example") SdkTempExample example);

    int updateByExample(@Param("record") SdkTemp record, @Param("example") SdkTempExample example);

    int updateByPrimaryKeySelective(SdkTemp record);

    int updateByPrimaryKey(SdkTemp record);
}