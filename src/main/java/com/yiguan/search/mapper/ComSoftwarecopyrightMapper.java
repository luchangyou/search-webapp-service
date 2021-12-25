package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComSoftwarecopyright;
import com.yiguan.search.model.ComSoftwarecopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComSoftwarecopyrightMapper {
    int countByExample(ComSoftwarecopyrightExample example);

    int deleteByExample(ComSoftwarecopyrightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComSoftwarecopyright record);

    int insertSelective(ComSoftwarecopyright record);

    List<ComSoftwarecopyright> selectByExample(ComSoftwarecopyrightExample example);

    List<ComSoftwarecopyright> selectByExampleForPage(@Param("example") ComSoftwarecopyrightExample example, @Param("page") Page<ComSoftwarecopyright> page);

    ComSoftwarecopyright selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComSoftwarecopyright record, @Param("example") ComSoftwarecopyrightExample example);

    int updateByExample(@Param("record") ComSoftwarecopyright record, @Param("example") ComSoftwarecopyrightExample example);

    int updateByPrimaryKeySelective(ComSoftwarecopyright record);

    int updateByPrimaryKey(ComSoftwarecopyright record);
}