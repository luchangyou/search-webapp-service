package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.EventMerger;
import com.yiguan.search.model.EventMergerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMergerMapper {
    int countByExample(EventMergerExample example);

    int deleteByExample(EventMergerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventMerger record);

    int insertSelective(EventMerger record);

    List<EventMerger> selectByExample(EventMergerExample example);

    List<EventMerger> selectByExampleForPage(@Param("example") EventMergerExample example, @Param("page") Page<EventMerger> page);

    EventMerger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventMerger record, @Param("example") EventMergerExample example);

    int updateByExample(@Param("record") EventMerger record, @Param("example") EventMergerExample example);

    int updateByPrimaryKeySelective(EventMerger record);

    int updateByPrimaryKey(EventMerger record);
}