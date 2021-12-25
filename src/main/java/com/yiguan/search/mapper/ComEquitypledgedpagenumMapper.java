package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComEquitypledgedpagenum;
import com.yiguan.search.model.ComEquitypledgedpagenumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComEquitypledgedpagenumMapper {
    int countByExample(ComEquitypledgedpagenumExample example);

    int deleteByExample(ComEquitypledgedpagenumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComEquitypledgedpagenum record);

    int insertSelective(ComEquitypledgedpagenum record);

    List<ComEquitypledgedpagenum> selectByExample(ComEquitypledgedpagenumExample example);

    List<ComEquitypledgedpagenum> selectByExampleForPage(@Param("example") ComEquitypledgedpagenumExample example, @Param("page") Page<ComEquitypledgedpagenum> page);

    ComEquitypledgedpagenum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComEquitypledgedpagenum record, @Param("example") ComEquitypledgedpagenumExample example);

    int updateByExample(@Param("record") ComEquitypledgedpagenum record, @Param("example") ComEquitypledgedpagenumExample example);

    int updateByPrimaryKeySelective(ComEquitypledgedpagenum record);

    int updateByPrimaryKey(ComEquitypledgedpagenum record);
}