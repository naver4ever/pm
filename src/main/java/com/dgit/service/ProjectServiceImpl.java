package com.dgit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dgit.domain.ProjectVO;
import com.dgit.persistence.ProjectDAO;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDAO dao;
	
	@Transactional
	@Override
	public void register(ProjectVO vo) throws Exception {
		dao.insertProject(vo);
	}

	@Override
	public ProjectVO read(Integer projectno) throws Exception {
		ProjectVO vo = dao.read(projectno);
		return vo;
	}

	@Override
	public void modify(ProjectVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public List<ProjectVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void delete(Integer projectno) throws Exception {
		dao.delete(projectno);
	}

}
