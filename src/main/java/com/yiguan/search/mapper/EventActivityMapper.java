package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.EventActivity;
import com.yiguan.search.model.EventActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventActivityMapper {
    int countByExample(EventActivityExample example);

    int deleteByExample(EventActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventActivity record);

    int insertSelective(EventActivity record);

    List<EventActivity> selectByExample(EventActivityExample example);

    List<EventActivity> selectByExampleForPage(@Param("example") EventActivityExample example, @Param("page") Page<EventActivity> page);

    EventActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventActivity record, @Param("example") EventActivityExample example);

    int updateByExample(@Param("record") EventActivity record, @Param("example") EventActivityExample example);

    int updateByPrimaryKeySelective(EventActivity record);

    int updateByPrimaryKey(EventActivity record);
}