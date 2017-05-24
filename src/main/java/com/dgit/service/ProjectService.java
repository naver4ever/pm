package com.dgit.service;

import java.util.List;

import com.dgit.domain.ProjectVO;

public interface ProjectService {
	public void register(ProjectVO vo) throws Exception;
	public ProjectVO read(Integer projectno) throws Exception;
	public void modify(ProjectVO vo) throws Exception;
	public List<ProjectVO> listAll() throws Exception;
	public void delete(Integer projectno) throws Exception;;
}
