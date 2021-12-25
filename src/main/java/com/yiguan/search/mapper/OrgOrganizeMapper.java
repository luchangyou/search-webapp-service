package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgOrganize;
import com.yiguan.search.model.OrgOrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgOrganizeMapper {
    int countByExample(OrgOrganizeExample example);

    int deleteByExample(OrgOrganizeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrgOrganize record);

    int insertSelective(OrgOrganize record);

    List<OrgOrganize> selectByExample(OrgOrganizeExample example);

    List<OrgOrganize> selectByExampleForPage(@Param("example") OrgOrganizeExample example, @Param("page") Page<OrgOrganize> page);

    OrgOrganize selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrgOrganize record, @Param("example") OrgOrganizeExample example);

    int updateByExample(@Param("record") OrgOrganize record, @Param("example") OrgOrganizeExample example);

    int updateByPrimaryKeySelective(OrgOrganize record);

    int updateByPrimaryKey(OrgOrganize record);
}