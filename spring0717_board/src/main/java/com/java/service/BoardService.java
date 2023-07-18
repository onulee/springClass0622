package com.java.service;

import java.util.ArrayList;

import com.java.dto.BoardDto;
import com.java.dto.PageDto;

public interface BoardService {

	//게시글 전체가져오기
	ArrayList<BoardDto> selectAll(PageDto pageDto);

}
