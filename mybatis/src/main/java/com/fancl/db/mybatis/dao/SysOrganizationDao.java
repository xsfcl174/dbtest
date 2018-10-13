package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.SysOrganization;
import com.fancl.db.mybatis.bean.SysOrganizationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizationDao {
    long countByCriteria(SysOrganizationCriteria example);

    int deleteByCriteria(SysOrganizationCriteria example);

    int deleteByPrimaryKey(String orgId);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    List<SysOrganization> selectByCriteria(SysOrganizationCriteria example);

    SysOrganization selectByPrimaryKey(String orgId);

    int updateByCriteriaSelective(@Param("record") SysOrganization record, @Param("example") SysOrganizationCriteria example);

    int updateByCriteria(@Param("record") SysOrganization record, @Param("example") SysOrganizationCriteria example);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
}