package com.java.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.java.dto.BoardDto;

@Mapper
public interface BoardMapper {

	//게시글 전체가져오기
	ArrayList<BoardDto> selectAll();

	//게시글 1개가져오기
	BoardDto selectOne(int bno);

	//게시글 1개저장
	void insertOne(BoardDto bdto);

	//게시글 1개삭제
	void deleteOne(int bno);

	//게시글 1개수정
	void updateOne(BoardDto bdto);

}
