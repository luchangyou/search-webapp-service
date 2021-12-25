package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComInvestmentInfo;
import com.yiguan.search.model.ComInvestmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComInvestmentInfoMapper {
    int countByExample(ComInvestmentInfoExample example);

    int deleteByExample(ComInvestmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComInvestmentInfo record);

    int insertSelective(ComInvestmentInfo record);

    List<ComInvestmentInfo> selectByExample(ComInvestmentInfoExample example);

    List<ComInvestmentInfo> selectByExampleForPage(@Param("example") ComInvestmentInfoExample example, @Param("page") Page<ComInvestmentInfo> page);

    ComInvestmentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComInvestmentInfo record, @Param("example") ComInvestmentInfoExample example);

    int updateByExample(@Param("record") ComInvestmentInfo record, @Param("example") ComInvestmentInfoExample example);

    int updateByPrimaryKeySelective(ComInvestmentInfo record);

    int updateByPrimaryKey(ComInvestmentInfo record);
}