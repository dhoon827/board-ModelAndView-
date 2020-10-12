package com.icia.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.board.dto.BoardDTO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	//글쓰기
	public int boardWrite(BoardDTO board) {
		return sql.insert("Board.boardWrite", board);
	}

	//글목록
	public List<BoardDTO> boardList() {
		return sql.selectList("Board.boardList");
	}

	//글 상세조회
	public BoardDTO boardView(int bnumber) {
		return sql.selectOne("Board.boardView", bnumber);
	}

	//조회수
	public int boardHits(int bnumber) {
		return sql.update("Board.boardHits", bnumber);
	}
	//수정 가져오기
	public BoardDTO boardUpdate(int bnumber) {
		return sql.selectOne("Board.boardUpdate", bnumber);
	}

	//글수정
	public int boardUpdateProcess(BoardDTO board) {
		return sql.update("Board.boardUpdateProcess", board);
	}

}
