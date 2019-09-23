package com.woniuxy.dao;

import com.woniuxy.domain.Stockinfo;
import com.woniuxy.domain.StockinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockinfoMapper {
    long countByExample(StockinfoExample example);

    int deleteByExample(StockinfoExample example);

    int deleteByPrimaryKey(Integer stockinfoid);

    int insert(Stockinfo record);

    int insertSelective(Stockinfo record);

    List<Stockinfo> selectByExample(StockinfoExample example);

    Stockinfo selectByPrimaryKey(Integer stockinfoid);

    int updateByExampleSelective(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

    int updateByExample(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

    int updateByPrimaryKeySelective(Stockinfo record);

    int updateByPrimaryKey(Stockinfo record);
}