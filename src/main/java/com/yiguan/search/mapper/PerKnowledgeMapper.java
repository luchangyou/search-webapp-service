package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerKnowledge;
import com.yiguan.search.model.PerKnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerKnowledgeMapper {
    int countByExample(PerKnowledgeExample example);

    int deleteByExample(PerKnowledgeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerKnowledge record);

    int insertSelective(PerKnowledge record);

    List<PerKnowledge> selectByExample(PerKnowledgeExample example);

    List<PerKnowledge> selectByExampleForPage(@Param("example") PerKnowledgeExample example, @Param("page") Page<PerKnowledge> page);

    PerKnowledge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerKnowledge record, @Param("example") PerKnowledgeExample example);

    int updateByExample(@Param("record") PerKnowledge record, @Param("example") PerKnowledgeExample example);

    int updateByPrimaryKeySelective(PerKnowledge record);

    int updateByPrimaryKey(PerKnowledge record);
}