package com.woniuxy.dao;

import com.woniuxy.domain.Clientlevl;
import com.woniuxy.domain.ClientlevlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientlevlMapper {
    long countByExample(ClientlevlExample example);

    int deleteByExample(ClientlevlExample example);

    int deleteByPrimaryKey(Integer clientlevlid);

    int insert(Clientlevl record);

    int insertSelective(Clientlevl record);

    List<Clientlevl> selectByExample(ClientlevlExample example);

    Clientlevl selectByPrimaryKey(Integer clientlevlid);

    int updateByExampleSelective(@Param("record") Clientlevl record, @Param("example") ClientlevlExample example);

    int updateByExample(@Param("record") Clientlevl record, @Param("example") ClientlevlExample example);

    int updateByPrimaryKeySelective(Clientlevl record);

    int updateByPrimaryKey(Clientlevl record);
}