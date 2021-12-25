package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerEducationInfo;
import com.yiguan.search.model.PerEducationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerEducationInfoMapper {
    int countByExample(PerEducationInfoExample example);

    int deleteByExample(PerEducationInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerEducationInfo record);

    int insertSelective(PerEducationInfo record);

    List<PerEducationInfo> selectByExample(PerEducationInfoExample example);

    List<PerEducationInfo> selectByExampleForPage(@Param("example") PerEducationInfoExample example, @Param("page") Page<PerEducationInfo> page);

    PerEducationInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerEducationInfo record, @Param("example") PerEducationInfoExample example);

    int updateByExample(@Param("record") PerEducationInfo record, @Param("example") PerEducationInfoExample example);

    int updateByPrimaryKeySelective(PerEducationInfo record);

    int updateByPrimaryKey(PerEducationInfo record);
}