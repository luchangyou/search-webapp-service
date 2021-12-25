package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ProOtherInfo;
import com.yiguan.search.model.ProOtherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProOtherInfoMapper {
    int countByExample(ProOtherInfoExample example);

    int deleteByExample(ProOtherInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProOtherInfo record);

    int insertSelective(ProOtherInfo record);

    List<ProOtherInfo> selectByExample(ProOtherInfoExample example);

    List<ProOtherInfo> selectByExampleForPage(@Param("example") ProOtherInfoExample example, @Param("page") Page<ProOtherInfo> page);

    ProOtherInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProOtherInfo record, @Param("example") ProOtherInfoExample example);

    int updateByExample(@Param("record") ProOtherInfo record, @Param("example") ProOtherInfoExample example);

    int updateByPrimaryKeySelective(ProOtherInfo record);

    int updateByPrimaryKey(ProOtherInfo record);
}