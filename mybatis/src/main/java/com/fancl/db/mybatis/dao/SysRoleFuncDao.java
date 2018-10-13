package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.SysRoleFunc;
import com.fancl.db.mybatis.bean.SysRoleFuncCriteria;
import com.fancl.db.mybatis.bean.SysRoleFuncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFuncDao {
    long countByCriteria(SysRoleFuncCriteria example);

    int deleteByCriteria(SysRoleFuncCriteria example);

    int deleteByPrimaryKey(SysRoleFuncKey key);

    int insert(SysRoleFunc record);

    int insertSelective(SysRoleFunc record);

    List<SysRoleFunc> selectByCriteria(SysRoleFuncCriteria example);

    SysRoleFunc selectByPrimaryKey(SysRoleFuncKey key);

    int updateByCriteriaSelective(@Param("record") SysRoleFunc record, @Param("example") SysRoleFuncCriteria example);

    int updateByCriteria(@Param("record") SysRoleFunc record, @Param("example") SysRoleFuncCriteria example);

    int updateByPrimaryKeySelective(SysRoleFunc record);

    int updateByPrimaryKey(SysRoleFunc record);
}