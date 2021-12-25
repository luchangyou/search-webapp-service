package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.InvestcomInfo;
import com.yiguan.search.model.InvestcomInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestcomInfoMapper {
    int countByExample(InvestcomInfoExample example);

    int deleteByExample(InvestcomInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestcomInfo record);

    int insertSelective(InvestcomInfo record);

    List<InvestcomInfo> selectByExample(InvestcomInfoExample example);

    List<InvestcomInfo> selectByExampleForPage(@Param("example") InvestcomInfoExample example, @Param("page") Page<InvestcomInfo> page);

    InvestcomInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestcomInfo record, @Param("example") InvestcomInfoExample example);

    int updateByExample(@Param("record") InvestcomInfo record, @Param("example") InvestcomInfoExample example);

    int updateByPrimaryKeySelective(InvestcomInfo record);

    int updateByPrimaryKey(InvestcomInfo record);
}