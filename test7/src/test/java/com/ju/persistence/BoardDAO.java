package com.ju.persistence;

import java.util.List;

import com.ju.domain.BoardVO;

public interface BoardDAO {
	public void create(BoardVO vo)throws Exception;
	public BoardVO read(int bno)throws Exception;
	public void update(BoardVO vo)throws Exception;
	public void delete(int bnt)throws Exception;
	public List<BoardVO>listAll() throws Exception;
}
