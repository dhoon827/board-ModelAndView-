package com.icia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dao.BoardDAO;
import com.icia.board.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	private ModelAndView mav; 

	//글쓰기
	public ModelAndView boardWrite(BoardDTO board) {
		int writeResult = boardDAO.boardWrite(board);
		mav = new ModelAndView();
		if(writeResult>0) 
			mav.setViewName("redirect:/boardlist");
		else 
			mav.setViewName("boardv/BoardWriteFail");
		
		return mav;
	}

	//글 목록
	public ModelAndView boardList() {
		mav = new ModelAndView();
		List<BoardDTO> boardList = boardDAO.boardList();
		mav.addObject("boardList", boardList);
		mav.setViewName("boardv/list");
		return mav;
	}

	//글 상세조회
	public ModelAndView boardView(int bnumber) {
		mav = new ModelAndView();
		int boardHits = boardDAO.boardHits(bnumber);
		BoardDTO boardView =  boardDAO.boardView(bnumber);
		mav.addObject("boardView", boardView);
		mav.setViewName("boardv/view");
		return mav;
	}

	//글 정보 가져오기 (수정)
	public ModelAndView boardUpdate(int bnumber) {
		mav = new ModelAndView();
		BoardDTO boardUpdate =  boardDAO.boardUpdate(bnumber);
		mav.addObject("boardUpdate", boardUpdate);
		mav.setViewName("boardv/update");
		return mav;
	}

	//글 수정
	public ModelAndView boardUpdateProcess(BoardDTO board) {
		mav = new ModelAndView();
		int updateResult = boardDAO.boardUpdateProcess(board);
		if(updateResult > 0)
			mav.setViewName("redirect:/boardview?bnumber="+board.getBnumber());
		else
			mav.setViewName("boardv/BoardUpdateFail");
		return mav;
	}

}
