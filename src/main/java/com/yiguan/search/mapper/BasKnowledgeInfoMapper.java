package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasKnowledgeInfo;
import com.yiguan.search.model.BasKnowledgeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasKnowledgeInfoMapper {
    int countByExample(BasKnowledgeInfoExample example);

    int deleteByExample(BasKnowledgeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasKnowledgeInfo record);

    int insertSelective(BasKnowledgeInfo record);

    List<BasKnowledgeInfo> selectByExample(BasKnowledgeInfoExample example);

    List<BasKnowledgeInfo> selectByExampleForPage(@Param("example") BasKnowledgeInfoExample example, @Param("page") Page<BasKnowledgeInfo> page);

    BasKnowledgeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasKnowledgeInfo record, @Param("example") BasKnowledgeInfoExample example);

    int updateByExample(@Param("record") BasKnowledgeInfo record, @Param("example") BasKnowledgeInfoExample example);

    int updateByPrimaryKeySelective(BasKnowledgeInfo record);

    int updateByPrimaryKey(BasKnowledgeInfo record);
}