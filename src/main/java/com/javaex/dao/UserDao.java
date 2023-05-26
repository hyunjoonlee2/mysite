package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	private UserDao userDao;
	
	
	//회원가입
	public int insertUser(UserVo userVo) {
		System.out.println("UserDao.insertUser()");
		System.out.println(userVo);
		int count = sqlSession.insert("user.insert",userVo);
		
		return count;
	}
	//로그인 -->세션 저장용
	public UserVo selectUser(UserVo userVo) {
		System.out.println("UserDao.selectUser()");

		
		UserVo authUser = sqlSession.selectOne("user.selectUser",userVo);
		return authUser;
		
		
	}
	
	/* 회원정보 수정 폼 회원정보 1명 가져오기 */
	public UserVo selectUser(int no) {
		System.out.println("UserDao.selectUser()");
		
		UserVo userVo = sqlSession.selectOne("user.selectUserByNo",no);
		
		return userVo;
		
		
		
	}
	
}
