package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgProduct;
import com.yiguan.search.model.OrgProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgProductMapper {
    int countByExample(OrgProductExample example);

    int deleteByExample(OrgProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrgProduct record);

    int insertSelective(OrgProduct record);

    List<OrgProduct> selectByExample(OrgProductExample example);

    List<OrgProduct> selectByExampleForPage(@Param("example") OrgProductExample example, @Param("page") Page<OrgProduct> page);

    OrgProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrgProduct record, @Param("example") OrgProductExample example);

    int updateByExample(@Param("record") OrgProduct record, @Param("example") OrgProductExample example);

    int updateByPrimaryKeySelective(OrgProduct record);

    int updateByPrimaryKey(OrgProduct record);
}