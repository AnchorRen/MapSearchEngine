package com.lmars.mapper;

import com.lmars.pojo.TbMapservice;
import com.lmars.pojo.TbMapserviceExample;
import com.lmars.pojo.TbMapserviceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMapserviceMapper {
    int countByExample(TbMapserviceExample example);

    int deleteByExample(TbMapserviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMapserviceWithBLOBs record);

    int insertSelective(TbMapserviceWithBLOBs record);

    List<TbMapserviceWithBLOBs> selectByExampleWithBLOBs(TbMapserviceExample example);

    List<TbMapservice> selectByExample(TbMapserviceExample example);

    TbMapserviceWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMapserviceWithBLOBs record, @Param("example") TbMapserviceExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMapserviceWithBLOBs record, @Param("example") TbMapserviceExample example);

    int updateByExample(@Param("record") TbMapservice record, @Param("example") TbMapserviceExample example);

    int updateByPrimaryKeySelective(TbMapserviceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbMapserviceWithBLOBs record);

    int updateByPrimaryKey(TbMapservice record);
}