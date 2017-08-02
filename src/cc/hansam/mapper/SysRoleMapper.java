package cc.hansam.mapper;

import java.util.List;

import cc.hansam.entity.SysRole;
import cc.hansam.entity.SysRoleExample;

public interface SysRoleMapper {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}