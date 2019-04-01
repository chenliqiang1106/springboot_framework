package com.framework.mapper;

import com.framework.entity.mapping.SysRole;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@org.apache.ibatis.annotations.Mapper
public interface SysRoleMapper extends Mapper<SysRole>, MySqlMapper<SysRole> {
}