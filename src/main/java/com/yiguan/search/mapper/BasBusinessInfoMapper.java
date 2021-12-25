package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasBusinessInfo;
import com.yiguan.search.model.BasBusinessInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasBusinessInfoMapper {
    int countByExample(BasBusinessInfoExample example);

    int deleteByExample(BasBusinessInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasBusinessInfo record);

    int insertSelective(BasBusinessInfo record);

    List<BasBusinessInfo> selectByExample(BasBusinessInfoExample example);

    List<BasBusinessInfo> selectByExampleForPage(@Param("example") BasBusinessInfoExample example, @Param("page") Page<BasBusinessInfo> page);

    BasBusinessInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasBusinessInfo record, @Param("example") BasBusinessInfoExample example);

    int updateByExample(@Param("record") BasBusinessInfo record, @Param("example") BasBusinessInfoExample example);

    int updateByPrimaryKeySelective(BasBusinessInfo record);

    int updateByPrimaryKey(BasBusinessInfo record);
}