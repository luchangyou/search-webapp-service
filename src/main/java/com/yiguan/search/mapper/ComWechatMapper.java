package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComWechat;
import com.yiguan.search.model.ComWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComWechatMapper {
    int countByExample(ComWechatExample example);

    int deleteByExample(ComWechatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComWechat record);

    int insertSelective(ComWechat record);

    List<ComWechat> selectByExample(ComWechatExample example);

    List<ComWechat> selectByExampleForPage(@Param("example") ComWechatExample example, @Param("page") Page<ComWechat> page);

    ComWechat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComWechat record, @Param("example") ComWechatExample example);

    int updateByExample(@Param("record") ComWechat record, @Param("example") ComWechatExample example);

    int updateByPrimaryKeySelective(ComWechat record);

    int updateByPrimaryKey(ComWechat record);
}