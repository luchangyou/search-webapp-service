package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComIcp;
import com.yiguan.search.model.ComIcpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComIcpMapper {
    int countByExample(ComIcpExample example);

    int deleteByExample(ComIcpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComIcp record);

    int insertSelective(ComIcp record);

    List<ComIcp> selectByExample(ComIcpExample example);

    List<ComIcp> selectByExampleForPage(@Param("example") ComIcpExample example, @Param("page") Page<ComIcp> page);

    ComIcp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComIcp record, @Param("example") ComIcpExample example);

    int updateByExample(@Param("record") ComIcp record, @Param("example") ComIcpExample example);

    int updateByPrimaryKeySelective(ComIcp record);

    int updateByPrimaryKey(ComIcp record);
}