package com.fancl.db.mybatis.dao;

import com.fancl.db.mybatis.bean.UrUsers;
import com.fancl.db.mybatis.bean.UrUsersCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrUsersDao {
    long countByCriteria(UrUsersCriteria example);

    int deleteByCriteria(UrUsersCriteria example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UrUsers record);

    int insertSelective(UrUsers record);

    List<UrUsers> selectByCriteria(UrUsersCriteria example);

    UrUsers selectByPrimaryKey(Integer userId);

    int updateByCriteriaSelective(@Param("record") UrUsers record, @Param("example") UrUsersCriteria example);

    int updateByCriteria(@Param("record") UrUsers record, @Param("example") UrUsersCriteria example);

    int updateByPrimaryKeySelective(UrUsers record);

    int updateByPrimaryKey(UrUsers record);
}