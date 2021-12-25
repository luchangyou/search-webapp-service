package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComChangeInfo;
import com.yiguan.search.model.ComChangeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComChangeInfoMapper {
    int countByExample(ComChangeInfoExample example);

    int deleteByExample(ComChangeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComChangeInfo record);

    int insertSelective(ComChangeInfo record);

    List<ComChangeInfo> selectByExample(ComChangeInfoExample example);

    List<ComChangeInfo> selectByExampleForPage(@Param("example") ComChangeInfoExample example, @Param("page") Page<ComChangeInfo> page);

    ComChangeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComChangeInfo record, @Param("example") ComChangeInfoExample example);

    int updateByExample(@Param("record") ComChangeInfo record, @Param("example") ComChangeInfoExample example);

    int updateByPrimaryKeySelective(ComChangeInfo record);

    int updateByPrimaryKey(ComChangeInfo record);
}