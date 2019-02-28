package com.homepage.gpcamp.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.homepage.gpcamp.dao.BoardDao;
import com.homepage.gpcamp.model.Board;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name="boardDao")
	private BoardDao boardDao;
	

	@Override
	public Board board_read(Board board) {
		
		return boardDao.board_read(board);
		
	}

	@Override
	public List<Board> board_list(Map<String, Object> paramMap) {
		return boardDao.board_list(paramMap);
	}

	@Override
	public int board_cnt(Map<String, Object> paramMap) {
		return boardDao.board_cnt(paramMap);
	}
	
	@Override
	public int board_hit(int board_seq) {
		return boardDao.board_hit(board_seq);
	}
	
}
