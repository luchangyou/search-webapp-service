package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgEvent;
import com.yiguan.search.model.OrgEventExample;
import com.yiguan.search.po.OrgEventPo;
import com.yiguan.search.po.SqlVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgEventMapper {
    int countByExample(OrgEventExample example);

    int deleteByExample(OrgEventExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrgEvent record);

    int insertSelective(OrgEvent record);

    List<OrgEvent> selectByExample(OrgEventExample example);

    List<OrgEvent> selectByExampleForPage(@Param("example") OrgEventExample example, @Param("page") Page<OrgEvent> page);

    OrgEvent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrgEvent record, @Param("example") OrgEventExample example);

    int updateByExample(@Param("record") OrgEvent record, @Param("example") OrgEventExample example);

    int updateByPrimaryKeySelective(OrgEvent record);

    int updateByPrimaryKey(OrgEvent record);

    List<OrgEventPo> getOrgEventPoList(SqlVo sqlVo);

}