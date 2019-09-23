package com.woniuxy.dao;

import com.woniuxy.domain.RolesUserExample;
import com.woniuxy.domain.RolesUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesUserMapper {
    long countByExample(RolesUserExample example);

    int deleteByExample(RolesUserExample example);

    int deleteByPrimaryKey(RolesUserKey key);

    int insert(RolesUserKey record);

    int insertSelective(RolesUserKey record);

    List<RolesUserKey> selectByExample(RolesUserExample example);

    int updateByExampleSelective(@Param("record") RolesUserKey record, @Param("example") RolesUserExample example);

    int updateByExample(@Param("record") RolesUserKey record, @Param("example") RolesUserExample example);
}