package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasOrganizeInfo;
import com.yiguan.search.model.BasOrganizeInfoExample;
import com.yiguan.search.po.OrgQryPartParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasOrganizeInfoMapper {
    int countByExample(BasOrganizeInfoExample example);

    int countNumber(OrgQryPartParam param);

    int deleteByExample(BasOrganizeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasOrganizeInfo record);

    int insertSelective(BasOrganizeInfo record);

    List<BasOrganizeInfo> selectByExample(BasOrganizeInfoExample example);

    List<BasOrganizeInfo> findBasOrganizeInfo(OrgQryPartParam param);

    List<BasOrganizeInfo> selectByExampleForPage(@Param("example") BasOrganizeInfoExample example, @Param("page") Page<BasOrganizeInfo> page);

    BasOrganizeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasOrganizeInfo record, @Param("example") BasOrganizeInfoExample example);

    int updateByExample(@Param("record") BasOrganizeInfo record, @Param("example") BasOrganizeInfoExample example);

    int updateByPrimaryKeySelective(BasOrganizeInfo record);

    int updateByPrimaryKey(BasOrganizeInfo record);
}