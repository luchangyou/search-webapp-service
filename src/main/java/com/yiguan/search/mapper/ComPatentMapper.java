package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComPatent;
import com.yiguan.search.model.ComPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComPatentMapper {
    int countByExample(ComPatentExample example);

    int deleteByExample(ComPatentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComPatent record);

    int insertSelective(ComPatent record);

    List<ComPatent> selectByExample(ComPatentExample example);

    List<ComPatent> selectByExampleForPage(@Param("example") ComPatentExample example, @Param("page") Page<ComPatent> page);

    ComPatent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComPatent record, @Param("example") ComPatentExample example);

    int updateByExample(@Param("record") ComPatent record, @Param("example") ComPatentExample example);

    int updateByPrimaryKeySelective(ComPatent record);

    int updateByPrimaryKey(ComPatent record);
}