package com.java.service;

import com.java.dto.MemberDto;

public interface MemberService {

	//회원 1명 가져오기(로그인)
	String selectOne(String id, String pw);

	


}
