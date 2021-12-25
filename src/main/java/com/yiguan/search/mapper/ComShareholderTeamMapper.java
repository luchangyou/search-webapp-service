package com.yiguan.search.mapper;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.ComShareholderTeam;
import com.yiguan.search.model.ComShareholderTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComShareholderTeamMapper {
    int countByExample(ComShareholderTeamExample example);

    int deleteByExample(ComShareholderTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComShareholderTeam record);

    int insertSelective(ComShareholderTeam record);

    List<ComShareholderTeam> selectByExample(ComShareholderTeamExample example);

    List<ComShareholderTeam> selectByExampleForPage(@Param("example") ComShareholderTeamExample example, @Param("page") Page<ComShareholderTeam> page);

    ComShareholderTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComShareholderTeam record, @Param("example") ComShareholderTeamExample example);

    int updateByExample(@Param("record") ComShareholderTeam record, @Param("example") ComShareholderTeamExample example);

    int updateByPrimaryKeySelective(ComShareholderTeam record);

    int updateByPrimaryKey(ComShareholderTeam record);
}