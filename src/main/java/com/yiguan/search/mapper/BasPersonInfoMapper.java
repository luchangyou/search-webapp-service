package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasPersonInfo;
import com.yiguan.search.model.BasPersonInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasPersonInfoMapper {
    int countByExample(BasPersonInfoExample example);

    int deleteByExample(BasPersonInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasPersonInfo record);

    int insertSelective(BasPersonInfo record);

    List<BasPersonInfo> selectByExample(BasPersonInfoExample example);

    List<BasPersonInfo> selectByExampleForPage(@Param("example") BasPersonInfoExample example, @Param("page") Page<BasPersonInfo> page);

    BasPersonInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasPersonInfo record, @Param("example") BasPersonInfoExample example);

    int updateByExample(@Param("record") BasPersonInfo record, @Param("example") BasPersonInfoExample example);

    int updateByPrimaryKeySelective(BasPersonInfo record);

    int updateByPrimaryKey(BasPersonInfo record);
}