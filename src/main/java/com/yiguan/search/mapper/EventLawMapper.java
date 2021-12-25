package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.EventLaw;
import com.yiguan.search.model.EventLawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventLawMapper {
    int countByExample(EventLawExample example);

    int deleteByExample(EventLawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventLaw record);

    int insertSelective(EventLaw record);

    List<EventLaw> selectByExample(EventLawExample example);

    List<EventLaw> selectByExampleForPage(@Param("example") EventLawExample example, @Param("page") Page<EventLaw> page);

    EventLaw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventLaw record, @Param("example") EventLawExample example);

    int updateByExample(@Param("record") EventLaw record, @Param("example") EventLawExample example);

    int updateByPrimaryKeySelective(EventLaw record);

    int updateByPrimaryKey(EventLaw record);
}