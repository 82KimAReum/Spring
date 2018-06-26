package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.BoardVO;

public interface BoardService {
	void insertBoard(BoardVO board);
	BoardVO selectBoard(int idx);
	List<BoardVO> select();
	void updateBoard(BoardVO board);
	void deleteBoard(int idx);
	void answerBoard(BoardVO board);
}
