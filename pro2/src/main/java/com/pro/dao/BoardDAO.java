package com.pro.dao;

import java.util.List;

import com.pro.domain.BoardVO;

public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(int bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(int bno) throws Exception;

	public List<BoardVO> listAll() throws Exception;

//	public void increaseViewcnt(int bno) throws Exception;
}
