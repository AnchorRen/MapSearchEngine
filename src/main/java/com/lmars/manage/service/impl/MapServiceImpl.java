package com.lmars.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmars.common.pojo.EasyUIDataGridResult;
import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.compoment.JedisClient;
import com.lmars.manage.service.MapService;
import com.lmars.manage.service.MapServiceLayerService;
import com.lmars.mapper.TbMapserviceLayersMapper;
import com.lmars.mapper.TbMapserviceMapper;
import com.lmars.pojo.TbMapserviceExample;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import com.lmars.pojo.TbMapserviceWithBLOBs;
@Service
public class MapServiceImpl implements MapService {

	@Autowired
	private TbMapserviceMapper mapServiceMapper;

	@Autowired
	private JedisClient jedisClient;

	@Autowired
	private MapServiceLayerService mapLayerService;

	@Autowired
	private TbMapserviceLayersMapper mapServiceLayerMapper;

	@Override
	public EasyUIDataGridResult getMapServiceList(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);

		TbMapserviceExample example = new TbMapserviceExample();
		// 执行查询
		List<TbMapserviceWithBLOBs> list = mapServiceMapper.selectByExampleWithBLOBs(example);
		// 获取分页信息

		PageInfo<TbMapserviceWithBLOBs> pageInfo = new PageInfo<>(list);
		// 返回查询结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);

		return result;
	}

	@Override
	public MapResult updateMapService(TbMapserviceWithBLOBs mapService) {
		try {
			// 更新数据库中的数据
			int result = mapServiceMapper.updateByPrimaryKeyWithBLOBs(mapService);

			// 删除Redis中的缓存(设置为立即过期！)
			Long id = mapService.getId();
			jedisClient.expire("MAP_ITEM:" + id, 0);

			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@Override
	public MapResult deleteMapService(Long[] ids) {
		try {
			for (Long id : ids) {
				// 删除指定的Id的服务
				mapServiceMapper.deleteByPrimaryKey(id);

				// 删除Redis中的缓存(设置为立即过期！)
				jedisClient.expire("MAP_ITEM:" + id, 0);

				TbMapserviceLayersExample example = new TbMapserviceLayersExample();
				com.lmars.pojo.TbMapserviceLayersExample.Criteria criteria = example.createCriteria();
				criteria.andMapserviceidEqualTo(id);
				List<TbMapserviceLayers> result = mapServiceLayerMapper.selectByExample(example);
				// 如果MapSErvice服务有图层，则删除图层信息和Solr中的索引信息
				if (result != null && result.size() > 0) {

					Long[] layerIds = new Long[result.size()];
					for (int i = 0; i < result.size(); i++) {
						layerIds[i] = result.get(i).getId();
					}
					// 删除此MapService对应的所有图层数据，删除Solr中的索引！
					mapLayerService.deleteMapServiceLayers(layerIds);
				}
			}
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
