package com.lmars.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmars.manage.service.AdminService;
import com.lmars.mapper.TbUserMapper;
import com.lmars.pojo.TbUser;
import com.lmars.pojo.TbUserExample;
import com.lmars.pojo.TbUserExample.Criteria;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public TbUser getByUserName(String userName) {
		
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<TbUser> result = userMapper.selectByExample(example );
		if(result != null && result.size()>0){
			return result.get(0);
		}
		return null;
	}
}
