package com.callor.hello.dao;

import java.util.List;

import com.callor.hello.model.ANemoVO;


public interface ANemoDao {

	public List<ANemoVO> selectAll();
	
	public ANemoVO findByRow(ANemoVO vo);
	
	public int insert(ANemoVO vo);
	
	public int update(ANemoVO vo);
}
