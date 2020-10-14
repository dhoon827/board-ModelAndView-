package com.icia.board.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService boardService;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
	
	//글쓰기 페이지 이동
	@RequestMapping(value="boardwriteform")
	public String join() {
		return "boardv/write";
	}
	
	//글쓰기
	@RequestMapping(value="/boardwrite")
	public ModelAndView write(@ModelAttribute BoardDTO board) {
		mav = boardService.boardWrite(board);
		return mav;
	}
	
	//글 목록
	@RequestMapping(value="boardlist")
	public ModelAndView boardList() {
		mav = boardService.boardList();
		return mav;
	}
	
	/*
	 * @RequestMapping(value="boardview") public ModelAndView
	 * boardView(@RequestParam("bnumber") int bnumber) { mav =
	 * boardService.boardView(bnumber); return mav; }
	 */
	
	//글 상세조회
	@RequestMapping(value="boardview")
	public ModelAndView boardView(@RequestParam("bnumber") int bnumber, 
			@RequestParam(value="page",required=false,defaultValue="1") int page) {
		mav = boardService.boardView(bnumber, page);
		return mav;
	}
	
	//글 정보 가져오기 (수정)
	@RequestMapping(value="boardupdate")
	public ModelAndView boardUpdate(@RequestParam("bnumber") int bnumber) {
		mav = boardService.boardUpdate(bnumber);
		return mav;
	}
	
	//글 수정
	@RequestMapping(value="/boardupdateprocess")
	public ModelAndView boardUpdateProcess(@ModelAttribute BoardDTO board) {
		mav = boardService.boardUpdateProcess(board);
		return mav;
	}
	
	//삭제
	@RequestMapping(value="/boarddelete")
	public ModelAndView boardDelete(@RequestParam("bnumber") int bnumber) {
		mav = boardService.boardDelete(bnumber);
		return mav;
	}
	
	//파일첨부 페이지 이동
	@RequestMapping(value="/boardwritefileform")
	public String boardWriteFileForm() {
		return "boardv/writefile";
	}
	
	//파일첨부
	@RequestMapping(value="/boardwritefile")
	public ModelAndView boardWriteFile(@ModelAttribute BoardDTO board) throws IllegalStateException, IOException {
		mav = boardService.boardWriteFile(board);
		return mav;
	}
	
	//페이징
	@RequestMapping(value="/boardlistpaging")
	public ModelAndView boardListPaging(@RequestParam(value="page",required=false,defaultValue="1") int page) {
		mav = boardService.boardListPaging(page);
		return mav;
	}
	
	//검색
	@RequestMapping(value="/boardsearch")
	public ModelAndView boardSearch(@RequestParam("searchtype") String searchtype,
			@RequestParam("keyword") String keyword) {
		mav = boardService.boardSearch(searchtype, keyword);
		return mav;
	}
}
