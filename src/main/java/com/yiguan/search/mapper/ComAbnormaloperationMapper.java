package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComAbnormaloperation;
import com.yiguan.search.model.ComAbnormaloperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComAbnormaloperationMapper {
    int countByExample(ComAbnormaloperationExample example);

    int deleteByExample(ComAbnormaloperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComAbnormaloperation record);

    int insertSelective(ComAbnormaloperation record);

    List<ComAbnormaloperation> selectByExample(ComAbnormaloperationExample example);

    List<ComAbnormaloperation> selectByExampleForPage(@Param("example") ComAbnormaloperationExample example, @Param("page") Page<ComAbnormaloperation> page);

    ComAbnormaloperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComAbnormaloperation record, @Param("example") ComAbnormaloperationExample example);

    int updateByExample(@Param("record") ComAbnormaloperation record, @Param("example") ComAbnormaloperationExample example);

    int updateByPrimaryKeySelective(ComAbnormaloperation record);

    int updateByPrimaryKey(ComAbnormaloperation record);
}