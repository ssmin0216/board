package com.pro.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.BoardVO;
import com.pro.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	// 의존 관계 주입 -> BoardServiceImpl 생성
	@Inject
	BoardService boardService;

	// @RequestMapping(value = "/boardList", method = RequestMethod.GET)
	@RequestMapping("boardList.do")
	public ModelAndView list() throws Exception {
		List<BoardVO> list = boardService.listAll();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardList"); // 뷰를 boardList.jsp로 설정
		mav.addObject("list", list); // 데이터를 저장
		logger.info("getList boardList입니다");
		return mav; // list.jsp로 List가 전달된다.
	}

}
