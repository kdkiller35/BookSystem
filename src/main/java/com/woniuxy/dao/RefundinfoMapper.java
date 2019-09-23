package com.woniuxy.dao;

import com.woniuxy.domain.Refundinfo;
import com.woniuxy.domain.RefundinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundinfoMapper {
    long countByExample(RefundinfoExample example);

    int deleteByExample(RefundinfoExample example);

    int deleteByPrimaryKey(Integer refundinfoid);

    int insert(Refundinfo record);

    int insertSelective(Refundinfo record);

    List<Refundinfo> selectByExample(RefundinfoExample example);

    Refundinfo selectByPrimaryKey(Integer refundinfoid);

    int updateByExampleSelective(@Param("record") Refundinfo record, @Param("example") RefundinfoExample example);

    int updateByExample(@Param("record") Refundinfo record, @Param("example") RefundinfoExample example);

    int updateByPrimaryKeySelective(Refundinfo record);

    int updateByPrimaryKey(Refundinfo record);
}