package cc.hansam.mapper;

import java.util.List;

import cc.hansam.entity.SysOp;
import cc.hansam.entity.SysOpExample;

public interface SysOpMapper {
    long countByExample(SysOpExample example);

    int deleteByExample(SysOpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOp record);

    int insertSelective(SysOp record);

    List<SysOp> selectByExample(SysOpExample example);

    SysOp selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(SysOp record);

    int updateByPrimaryKey(SysOp record);
}