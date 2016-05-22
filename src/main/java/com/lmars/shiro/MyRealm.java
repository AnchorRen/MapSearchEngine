package com.lmars.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.lmars.manage.service.AdminService;
import com.lmars.pojo.TbUser;
/**
 * 自定义Realm
 * @author REN
 *
 */
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private AdminService adminService;
	
	/**
	 * 为当前登录的用户授予用户和权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String userName=(String)token.getPrincipal();
		TbUser user = adminService.getByUserName(userName);
		if(user != null){
			SecurityUtils.getSubject().getSession().setAttribute("user", user); // 当前用户信息存到session中
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),this.getName());
			return authcInfo;
		}else{
			return null;				
		}
	}

}
