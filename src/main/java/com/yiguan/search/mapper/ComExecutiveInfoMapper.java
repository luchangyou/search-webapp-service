package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComExecutiveInfo;
import com.yiguan.search.model.ComExecutiveInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComExecutiveInfoMapper {
    int countByExample(ComExecutiveInfoExample example);

    int deleteByExample(ComExecutiveInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComExecutiveInfo record);

    int insertSelective(ComExecutiveInfo record);

    List<ComExecutiveInfo> selectByExample(ComExecutiveInfoExample example);

    List<ComExecutiveInfo> selectByExampleForPage(@Param("example") ComExecutiveInfoExample example, @Param("page") Page<ComExecutiveInfo> page);

    ComExecutiveInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComExecutiveInfo record, @Param("example") ComExecutiveInfoExample example);

    int updateByExample(@Param("record") ComExecutiveInfo record, @Param("example") ComExecutiveInfoExample example);

    int updateByPrimaryKeySelective(ComExecutiveInfo record);

    int updateByPrimaryKey(ComExecutiveInfo record);
}