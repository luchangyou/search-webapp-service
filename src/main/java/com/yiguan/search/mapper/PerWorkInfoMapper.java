package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerWorkInfo;
import com.yiguan.search.model.PerWorkInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerWorkInfoMapper {
    int countByExample(PerWorkInfoExample example);

    int deleteByExample(PerWorkInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerWorkInfo record);

    int insertSelective(PerWorkInfo record);

    List<PerWorkInfo> selectByExample(PerWorkInfoExample example);

    List<PerWorkInfo> selectByExampleForPage(@Param("example") PerWorkInfoExample example, @Param("page") Page<PerWorkInfo> page);

    PerWorkInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerWorkInfo record, @Param("example") PerWorkInfoExample example);

    int updateByExample(@Param("record") PerWorkInfo record, @Param("example") PerWorkInfoExample example);

    int updateByPrimaryKeySelective(PerWorkInfo record);

    int updateByPrimaryKey(PerWorkInfo record);
}