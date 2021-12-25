package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComTminfo;
import com.yiguan.search.model.ComTminfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComTminfoMapper {
    int countByExample(ComTminfoExample example);

    int deleteByExample(ComTminfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComTminfo record);

    int insertSelective(ComTminfo record);

    List<ComTminfo> selectByExample(ComTminfoExample example);

    List<ComTminfo> selectByExampleForPage(@Param("example") ComTminfoExample example, @Param("page") Page<ComTminfo> page);

    ComTminfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComTminfo record, @Param("example") ComTminfoExample example);

    int updateByExample(@Param("record") ComTminfo record, @Param("example") ComTminfoExample example);

    int updateByPrimaryKeySelective(ComTminfo record);

    int updateByPrimaryKey(ComTminfo record);
}