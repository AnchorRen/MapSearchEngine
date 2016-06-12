package com.lmars.CRS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmars.common.utils.JsonUtils;
import com.lmars.mapper.TbMapserviceMapper;
import com.lmars.pojo.TbMapservice;
import com.lmars.pojo.TbMapserviceExample;
import com.lmars.pojo.TbMapserviceWithBLOBs;

public class CRSNumsTest {
	
	public static void main(String[] args) {
		
		//TestRefWhenSPISNULL();
		getDiffCRSCount();
	}
	
	/*@Autowired
	static
	TbMapserviceMapper mapServieMapper;
	*/
	
	public static void TestRefWhenSPISNULL(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		TbMapserviceMapper mapServieMapper = ap.getBean(TbMapserviceMapper.class);
		
		TbMapserviceWithBLOBs result = mapServieMapper.selectByPrimaryKey(20015854L);
		
		String Ref = result.getInitialextend();
		SpatialReference reference = JsonUtils.jsonToPojo(Ref, SpatialReference.class);
		System.out.println(reference.getLatestWkid());
	}
	
	public static void getDiffCRSCount(){
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		TbMapserviceMapper mapServieMapper = ap.getBean(TbMapserviceMapper.class);
		
		TbMapserviceExample example = new TbMapserviceExample();
		List<TbMapservice> result = mapServieMapper.selectByExample(example);
		
		Set<String> CRS = new HashSet<>();
		
		for (TbMapservice tbMapservice : result) {
			
			String initialExtends = tbMapservice.getInitialextend();
			InitialExtends extend = JsonUtils.jsonToPojo(initialExtends, InitialExtends.class);
			SpatialReference ref = extend.getSpatialReference();
			
			try {
				if(ref.getLatestWkid() != null && ref.getLatestWkid()!=""){
					
					System.out.println(ref.getLatestWkid());
					CRS.add(ref.getLatestWkid());
				}
			} catch (Exception e) {
				System.out.println(tbMapservice.getId());
				e.printStackTrace();
			}
		}
		
		System.out.println("CRS NUMs: "+CRS.size());
		System.out.println("------------------------");
		for (String string : CRS) {
			System.out.println(string);
		}
	}
	
}
