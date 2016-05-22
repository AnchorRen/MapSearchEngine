package com.lmars.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5加密工具类
 * @author REN
 *
 */
public class CryptographyUtil {

	/**
	 * MD5加密
	 * @param str  要加密的字符
	 * @param salt 加盐处理
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="iamadmin";
		System.out.println("Md5加密："+CryptographyUtil.md5(password, "lmars"));
	}
}
