package com.lmars.CRS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmars.mapper.TbWmsLayersMapper;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;

public class WMSEPSGTest {

	public static void main(String[] args) {
		showEPSGTypes();
	}
	
	public static void showEPSGTypes(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		TbWmsLayersMapper wmsMapper = ap.getBean(TbWmsLayersMapper.class);
		
		TbWmsLayersExample example = new TbWmsLayersExample();
		List<TbWmsLayers> result = wmsMapper.selectByExample(example);
		Map<String, Integer> EPSGAndCount = new HashMap<>();

		//Set<String> EPSGTypes = new HashSet<>();
		for (TbWmsLayers tbWmsLayers : result) {
			String boundingBox = tbWmsLayers.getBoundingbox();
			String EPSG = boundingBox.split(" ")[0];
			Integer count = EPSGAndCount.get(EPSG);
			//System.out.println(count);
			if(count==null){
				EPSGAndCount.put(EPSG, 1);
			}else{
				EPSGAndCount.put(EPSG, ++count);
			}
		}
		
		for(Map.Entry<String, Integer> entry: EPSGAndCount.entrySet()){
			
			System.out.println("【"+entry.getKey()+"】"+":\t"+entry.getValue());
		}
	}
}
