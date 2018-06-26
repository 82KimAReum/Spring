package com.javasoft.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.BoardVO;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void create(BoardVO board) {
		this.sqlSession.insert("Board.insertSP",board);
		
	}

	@Override
	public BoardVO read(int idx) {
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("idx", idx);
		this.sqlSession.selectOne("Board.selectByIdx", map);
		List<BoardVO> list=(List<BoardVO>)map.get("result");
		return list.get(0);
	}

	@Override
	public List<BoardVO> readAll() {
		Map<String , Object>map=new HashMap<String,Object>();
		this.sqlSession.selectList("Board.selectAllSP",map);
		List<BoardVO>list =(List<BoardVO>)map.get("results");
		return list;
	}

	@Override
	public void update(BoardVO board) {
		this.sqlSession.update("Board.updateSP", board);
	}

	@Override
	public void delete(int idx) {
		this.sqlSession.delete("Board.deleteSP", idx);
	}

	@Override
	public void answer(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

}
