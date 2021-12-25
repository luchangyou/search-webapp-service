package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgKnowledge;
import com.yiguan.search.model.OrgKnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgKnowledgeMapper {
    int countByExample(OrgKnowledgeExample example);

    int deleteByExample(OrgKnowledgeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrgKnowledge record);

    int insertSelective(OrgKnowledge record);

    List<OrgKnowledge> selectByExample(OrgKnowledgeExample example);

    List<OrgKnowledge> selectByExampleForPage(@Param("example") OrgKnowledgeExample example, @Param("page") Page<OrgKnowledge> page);

    OrgKnowledge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrgKnowledge record, @Param("example") OrgKnowledgeExample example);

    int updateByExample(@Param("record") OrgKnowledge record, @Param("example") OrgKnowledgeExample example);

    int updateByPrimaryKeySelective(OrgKnowledge record);

    int updateByPrimaryKey(OrgKnowledge record);
}