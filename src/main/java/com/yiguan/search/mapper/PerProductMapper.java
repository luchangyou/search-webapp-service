package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.PerProduct;
import com.yiguan.search.model.PerProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerProductMapper {
    int countByExample(PerProductExample example);

    int deleteByExample(PerProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerProduct record);

    int insertSelective(PerProduct record);

    List<PerProduct> selectByExample(PerProductExample example);

    List<PerProduct> selectByExampleForPage(@Param("example") PerProductExample example, @Param("page") Page<PerProduct> page);

    PerProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerProduct record, @Param("example") PerProductExample example);

    int updateByExample(@Param("record") PerProduct record, @Param("example") PerProductExample example);

    int updateByPrimaryKeySelective(PerProduct record);

    int updateByPrimaryKey(PerProduct record);
}