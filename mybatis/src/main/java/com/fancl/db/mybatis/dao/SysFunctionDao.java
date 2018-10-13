package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.SysFunction;
import com.fancl.db.mybatis.bean.SysFunctionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionDao {
    long countByCriteria(SysFunctionCriteria example);

    int deleteByCriteria(SysFunctionCriteria example);

    int deleteByPrimaryKey(Integer fnId);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    List<SysFunction> selectByCriteria(SysFunctionCriteria example);

    SysFunction selectByPrimaryKey(Integer fnId);

    int updateByCriteriaSelective(@Param("record") SysFunction record, @Param("example") SysFunctionCriteria example);

    int updateByCriteria(@Param("record") SysFunction record, @Param("example") SysFunctionCriteria example);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);
}