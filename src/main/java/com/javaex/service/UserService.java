package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	//회원 등록
	public int join(UserVo userVo) {
		System.out.println("UserService.join");
		
		int count = userDao.insertUser(userVo);
		return count;
	}
	//로그인
	public UserVo login(UserVo userVo) {
		System.out.println("UserService.login");
		UserVo authUser = userDao.selectUser(userVo);
		return authUser; 
		
		
		
	}
	/* 회원정보 수정 폼 */
	public UserVo modifyForm(int no) {
		System.out.println("UserService.modifyForm()");
		
		
		UserVo userVo = userDao.selectUser(no);
		
		return userVo; 
		
	}
	
	
}
