package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.EventInvestfinace;
import com.yiguan.search.model.EventInvestfinaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventInvestfinaceMapper {
    int countByExample(EventInvestfinaceExample example);

    int deleteByExample(EventInvestfinaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventInvestfinace record);

    int insertSelective(EventInvestfinace record);

    List<EventInvestfinace> selectByExample(EventInvestfinaceExample example);

    List<EventInvestfinace> selectByExampleForPage(@Param("example") EventInvestfinaceExample example, @Param("page") Page<EventInvestfinace> page);

    EventInvestfinace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventInvestfinace record, @Param("example") EventInvestfinaceExample example);

    int updateByExample(@Param("record") EventInvestfinace record, @Param("example") EventInvestfinaceExample example);

    int updateByPrimaryKeySelective(EventInvestfinace record);

    int updateByPrimaryKey(EventInvestfinace record);
}