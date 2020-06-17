package com.pro.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.pro.dao.BoardDAO;
import com.pro.domain.BoardVO;

@Repository
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.create(vo);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(vo);
	}

	@Override
	public void remove(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

//	@Override
//	public void increaseViewcnt(int bno, HttpSession session) throws Exception {
//		// TODO Auto-generated method stub
//		long update_time = 0;
//
//		if (session.getAttribute("update_time_" + bno) != null) {
//			update_time = (long) session.getAttribute("update_time_" + bno);
//		}
//
//		// 시스템 현재시간을 current_time에 저장
//		long current_time = System.currentTimeMillis();
//
//		// 일정시간이 경과 후 조회수 증가 처리
//		// 시스템현재시간 - 열람시간 > 일정시간
//		if (current_time - update_time > 5 * 1000) {
//			dao.increaseViewcnt(bno);
//
//			// 세션에 시간을 저장
//			session.setAttribute("update_time_" + bno, current_time);
//		}
//	}

}
