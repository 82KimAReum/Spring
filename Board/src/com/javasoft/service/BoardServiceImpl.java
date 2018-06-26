package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.BoardDao;
import com.javasoft.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void insertBoard(BoardVO board) {
		this.boardDao.create(board);
		
	}

	@Override
	public BoardVO selectBoard(int idx) {
		return this.boardDao.read(idx);
	}

	@Override
	public List<BoardVO> select() {
		return this.boardDao.readAll();
	}

	@Override
	public void updateBoard(BoardVO board) {
		this.boardDao.update(board);
	}

	@Override
	public void deleteBoard(int idx) {
		this.boardDao.delete(idx);
	}

	@Override
	public void answerBoard(BoardVO board) {
		this.boardDao.answer(board);
	}

}
