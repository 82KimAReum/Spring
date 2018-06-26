package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.BoardVO;

public interface BoardDao {
	void create(BoardVO board);
	BoardVO read(int idx);
	List<BoardVO> readAll();
	void update(BoardVO board);
	void delete(int idx);
	void answer(BoardVO board);
}
