package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasEventInfo;
import com.yiguan.search.model.BasEventInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasEventInfoMapper {
    int countByExample(BasEventInfoExample example);

    int deleteByExample(BasEventInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasEventInfo record);

    int insertSelective(BasEventInfo record);

    List<BasEventInfo> selectByExample(BasEventInfoExample example);

    List<BasEventInfo> selectByExampleForPage(@Param("example") BasEventInfoExample example, @Param("page") Page<BasEventInfo> page);

    BasEventInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasEventInfo record, @Param("example") BasEventInfoExample example);

    int updateByExample(@Param("record") BasEventInfo record, @Param("example") BasEventInfoExample example);

    int updateByPrimaryKeySelective(BasEventInfo record);

    int updateByPrimaryKey(BasEventInfo record);
}