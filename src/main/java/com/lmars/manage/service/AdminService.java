package com.lmars.manage.service;

import com.lmars.pojo.TbUser;

/**
 * 管理员Service
 * @author REN
 *
 */
public interface AdminService {

	/**
	 * 根据用户名查找数据库中的用户
	 * @param userName
	 * @return
	 */
	TbUser getByUserName(String userName);
}
