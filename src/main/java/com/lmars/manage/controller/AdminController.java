package com.lmars.manage.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmars.common.utils.CryptographyUtil;
import com.lmars.manage.service.AdminService;
import com.lmars.pojo.TbUser;
/**
 * 用户登录Controller
 * @author REN
 *
 */
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping("/validate")
	public String login(TbUser user,HttpServletRequest request){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), CryptographyUtil.md5(user.getPassword(), "lmars"));
		
		try{
			subject.login(token); // 登录验证
			return "redirect:/manage";
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("errorInfo", "用户名或密码错误！");
			return "login";
		}
	}
	
	@RequestMapping("/logout")
	public String  logout()throws Exception{
		SecurityUtils.getSubject().logout();
		return "redirect:/login";
	}
}
