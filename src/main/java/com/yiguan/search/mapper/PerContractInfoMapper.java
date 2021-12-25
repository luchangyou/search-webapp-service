package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerContractInfo;
import com.yiguan.search.model.PerContractInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerContractInfoMapper {
    int countByExample(PerContractInfoExample example);

    int deleteByExample(PerContractInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerContractInfo record);

    int insertSelective(PerContractInfo record);

    List<PerContractInfo> selectByExample(PerContractInfoExample example);

    List<PerContractInfo> selectByExampleForPage(@Param("example") PerContractInfoExample example, @Param("page") Page<PerContractInfo> page);

    PerContractInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerContractInfo record, @Param("example") PerContractInfoExample example);

    int updateByExample(@Param("record") PerContractInfo record, @Param("example") PerContractInfoExample example);

    int updateByPrimaryKeySelective(PerContractInfo record);

    int updateByPrimaryKey(PerContractInfo record);
}