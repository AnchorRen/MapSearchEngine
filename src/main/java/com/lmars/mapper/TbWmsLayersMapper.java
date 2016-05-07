package com.lmars.mapper;

import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWmsLayersMapper {
    int countByExample(TbWmsLayersExample example);

    int deleteByExample(TbWmsLayersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbWmsLayers record);

    int insertSelective(TbWmsLayers record);

    List<TbWmsLayers> selectByExampleWithBLOBs(TbWmsLayersExample example);

    List<TbWmsLayers> selectByExample(TbWmsLayersExample example);

    TbWmsLayers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbWmsLayers record, @Param("example") TbWmsLayersExample example);

    int updateByExampleWithBLOBs(@Param("record") TbWmsLayers record, @Param("example") TbWmsLayersExample example);

    int updateByExample(@Param("record") TbWmsLayers record, @Param("example") TbWmsLayersExample example);

    int updateByPrimaryKeySelective(TbWmsLayers record);

    int updateByPrimaryKeyWithBLOBs(TbWmsLayers record);

    int updateByPrimaryKey(TbWmsLayers record);
}