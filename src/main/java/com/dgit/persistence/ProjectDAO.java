package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.ProjectVO;

public interface ProjectDAO {
	public void insertProject(ProjectVO vo) throws Exception;
	public List<ProjectVO> listAll() throws Exception;
	public ProjectVO read(Integer projectno) throws Exception;
	public void update(ProjectVO vo) throws Exception;;
	public void delete(Integer projectno) throws Exception;
} 
