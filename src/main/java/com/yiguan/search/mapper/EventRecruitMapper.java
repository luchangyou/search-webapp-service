package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.EventRecruit;
import com.yiguan.search.model.EventRecruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventRecruitMapper {
    int countByExample(EventRecruitExample example);

    int deleteByExample(EventRecruitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventRecruit record);

    int insertSelective(EventRecruit record);

    List<EventRecruit> selectByExample(EventRecruitExample example);

    List<EventRecruit> selectByExampleForPage(@Param("example") EventRecruitExample example, @Param("page") Page<EventRecruit> page);

    EventRecruit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventRecruit record, @Param("example") EventRecruitExample example);

    int updateByExample(@Param("record") EventRecruit record, @Param("example") EventRecruitExample example);

    int updateByPrimaryKeySelective(EventRecruit record);

    int updateByPrimaryKey(EventRecruit record);
}