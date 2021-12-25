package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerGameInfo;
import com.yiguan.search.model.PerGameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerGameInfoMapper {
    int countByExample(PerGameInfoExample example);

    int deleteByExample(PerGameInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerGameInfo record);

    int insertSelective(PerGameInfo record);

    List<PerGameInfo> selectByExample(PerGameInfoExample example);

    List<PerGameInfo> selectByExampleForPage(@Param("example") PerGameInfoExample example, @Param("page") Page<PerGameInfo> page);

    PerGameInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerGameInfo record, @Param("example") PerGameInfoExample example);

    int updateByExample(@Param("record") PerGameInfo record, @Param("example") PerGameInfoExample example);

    int updateByPrimaryKeySelective(PerGameInfo record);

    int updateByPrimaryKey(PerGameInfo record);
}