package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComShareholder;
import com.yiguan.search.model.ComShareholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComShareholderMapper {
    int countByExample(ComShareholderExample example);

    int deleteByExample(ComShareholderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComShareholder record);

    int insertSelective(ComShareholder record);

    List<ComShareholder> selectByExample(ComShareholderExample example);

    List<ComShareholder> selectByExampleForPage(@Param("example") ComShareholderExample example, @Param("page") Page<ComShareholder> page);

    ComShareholder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComShareholder record, @Param("example") ComShareholderExample example);

    int updateByExample(@Param("record") ComShareholder record, @Param("example") ComShareholderExample example);

    int updateByPrimaryKeySelective(ComShareholder record);

    int updateByPrimaryKey(ComShareholder record);
}