package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.SysSubFunc;
import com.fancl.db.mybatis.bean.SysSubFuncCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSubFuncDao {
    long countByCriteria(SysSubFuncCriteria example);

    int deleteByCriteria(SysSubFuncCriteria example);

    int deleteByPrimaryKey(Integer sfId);

    int insert(SysSubFunc record);

    int insertSelective(SysSubFunc record);

    List<SysSubFunc> selectByCriteria(SysSubFuncCriteria example);

    SysSubFunc selectByPrimaryKey(Integer sfId);

    int updateByCriteriaSelective(@Param("record") SysSubFunc record, @Param("example") SysSubFuncCriteria example);

    int updateByCriteria(@Param("record") SysSubFunc record, @Param("example") SysSubFuncCriteria example);

    int updateByPrimaryKeySelective(SysSubFunc record);

    int updateByPrimaryKey(SysSubFunc record);
}