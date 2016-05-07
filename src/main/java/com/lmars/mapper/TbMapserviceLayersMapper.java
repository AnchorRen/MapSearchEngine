package com.lmars.mapper;

import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMapserviceLayersMapper {
    int countByExample(TbMapserviceLayersExample example);

    int deleteByExample(TbMapserviceLayersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMapserviceLayers record);

    int insertSelective(TbMapserviceLayers record);

    List<TbMapserviceLayers> selectByExampleWithBLOBs(TbMapserviceLayersExample example);

    List<TbMapserviceLayers> selectByExample(TbMapserviceLayersExample example);

    TbMapserviceLayers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMapserviceLayers record, @Param("example") TbMapserviceLayersExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMapserviceLayers record, @Param("example") TbMapserviceLayersExample example);

    int updateByExample(@Param("record") TbMapserviceLayers record, @Param("example") TbMapserviceLayersExample example);

    int updateByPrimaryKeySelective(TbMapserviceLayers record);

    int updateByPrimaryKeyWithBLOBs(TbMapserviceLayers record);

    int updateByPrimaryKey(TbMapserviceLayers record);
}