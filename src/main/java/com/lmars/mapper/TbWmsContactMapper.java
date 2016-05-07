package com.lmars.mapper;

import com.lmars.pojo.TbWmsContact;
import com.lmars.pojo.TbWmsContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWmsContactMapper {
    int countByExample(TbWmsContactExample example);

    int deleteByExample(TbWmsContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbWmsContact record);

    int insertSelective(TbWmsContact record);

    List<TbWmsContact> selectByExample(TbWmsContactExample example);

    TbWmsContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbWmsContact record, @Param("example") TbWmsContactExample example);

    int updateByExample(@Param("record") TbWmsContact record, @Param("example") TbWmsContactExample example);

    int updateByPrimaryKeySelective(TbWmsContact record);

    int updateByPrimaryKey(TbWmsContact record);
}