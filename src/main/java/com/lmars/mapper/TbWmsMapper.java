package com.lmars.mapper;

import com.lmars.pojo.TbWms;
import com.lmars.pojo.TbWmsExample;
import com.lmars.pojo.TbWmsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWmsMapper {
    int countByExample(TbWmsExample example);

    int deleteByExample(TbWmsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbWmsWithBLOBs record);

    int insertSelective(TbWmsWithBLOBs record);

    List<TbWmsWithBLOBs> selectByExampleWithBLOBs(TbWmsExample example);

    List<TbWms> selectByExample(TbWmsExample example);

    TbWmsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbWmsWithBLOBs record, @Param("example") TbWmsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbWmsWithBLOBs record, @Param("example") TbWmsExample example);

    int updateByExample(@Param("record") TbWms record, @Param("example") TbWmsExample example);

    int updateByPrimaryKeySelective(TbWmsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbWmsWithBLOBs record);

    int updateByPrimaryKey(TbWms record);
}