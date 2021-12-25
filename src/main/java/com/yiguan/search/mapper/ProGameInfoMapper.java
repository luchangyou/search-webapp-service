package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ProGameInfo;
import com.yiguan.search.model.ProGameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProGameInfoMapper {
    int countByExample(ProGameInfoExample example);

    int deleteByExample(ProGameInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProGameInfo record);

    int insertSelective(ProGameInfo record);

    List<ProGameInfo> selectByExample(ProGameInfoExample example);

    List<ProGameInfo> selectByExampleForPage(@Param("example") ProGameInfoExample example, @Param("page") Page<ProGameInfo> page);

    ProGameInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProGameInfo record, @Param("example") ProGameInfoExample example);

    int updateByExample(@Param("record") ProGameInfo record, @Param("example") ProGameInfoExample example);

    int updateByPrimaryKeySelective(ProGameInfo record);

    int updateByPrimaryKey(ProGameInfo record);
}