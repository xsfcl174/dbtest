package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.SysRoleSubFunc;
import com.fancl.db.mybatis.bean.SysRoleSubFuncCriteria;
import com.fancl.db.mybatis.bean.SysRoleSubFuncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleSubFuncDao {
    long countByCriteria(SysRoleSubFuncCriteria example);

    int deleteByCriteria(SysRoleSubFuncCriteria example);

    int deleteByPrimaryKey(SysRoleSubFuncKey key);

    int insert(SysRoleSubFunc record);

    int insertSelective(SysRoleSubFunc record);

    List<SysRoleSubFunc> selectByCriteria(SysRoleSubFuncCriteria example);

    SysRoleSubFunc selectByPrimaryKey(SysRoleSubFuncKey key);

    int updateByCriteriaSelective(@Param("record") SysRoleSubFunc record, @Param("example") SysRoleSubFuncCriteria example);

    int updateByCriteria(@Param("record") SysRoleSubFunc record, @Param("example") SysRoleSubFuncCriteria example);

    int updateByPrimaryKeySelective(SysRoleSubFunc record);

    int updateByPrimaryKey(SysRoleSubFunc record);
}