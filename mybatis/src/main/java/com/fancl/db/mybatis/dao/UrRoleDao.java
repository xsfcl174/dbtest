package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.UrRole;
import com.fancl.db.mybatis.bean.UrRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrRoleDao {
    long countByCriteria(UrRoleCriteria example);

    int deleteByCriteria(UrRoleCriteria example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(UrRole record);

    int insertSelective(UrRole record);

    List<UrRole> selectByCriteria(UrRoleCriteria example);

    UrRole selectByPrimaryKey(Integer roleId);

    int updateByCriteriaSelective(@Param("record") UrRole record, @Param("example") UrRoleCriteria example);

    int updateByCriteria(@Param("record") UrRole record, @Param("example") UrRoleCriteria example);

    int updateByPrimaryKeySelective(UrRole record);

    int updateByPrimaryKey(UrRole record);
}