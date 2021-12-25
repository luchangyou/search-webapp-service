package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComCopyrightwork;
import com.yiguan.search.model.ComCopyrightworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComCopyrightworkMapper {
    int countByExample(ComCopyrightworkExample example);

    int deleteByExample(ComCopyrightworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComCopyrightwork record);

    int insertSelective(ComCopyrightwork record);

    List<ComCopyrightwork> selectByExample(ComCopyrightworkExample example);

    List<ComCopyrightwork> selectByExampleForPage(@Param("example") ComCopyrightworkExample example, @Param("page") Page<ComCopyrightwork> page);

    ComCopyrightwork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComCopyrightwork record, @Param("example") ComCopyrightworkExample example);

    int updateByExample(@Param("record") ComCopyrightwork record, @Param("example") ComCopyrightworkExample example);

    int updateByPrimaryKeySelective(ComCopyrightwork record);

    int updateByPrimaryKey(ComCopyrightwork record);
}