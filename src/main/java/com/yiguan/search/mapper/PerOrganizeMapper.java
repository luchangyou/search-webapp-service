package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerOrganize;
import com.yiguan.search.model.PerOrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerOrganizeMapper {
    int countByExample(PerOrganizeExample example);

    int deleteByExample(PerOrganizeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerOrganize record);

    int insertSelective(PerOrganize record);

    List<PerOrganize> selectByExample(PerOrganizeExample example);

    List<PerOrganize> selectByExampleForPage(@Param("example") PerOrganizeExample example, @Param("page") Page<PerOrganize> page);

    PerOrganize selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerOrganize record, @Param("example") PerOrganizeExample example);

    int updateByExample(@Param("record") PerOrganize record, @Param("example") PerOrganizeExample example);

    int updateByPrimaryKeySelective(PerOrganize record);

    int updateByPrimaryKey(PerOrganize record);
}