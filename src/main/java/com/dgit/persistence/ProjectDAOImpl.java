package com.dgit.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.ProjectVO;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
	
	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.dgit.mapper.ProjectMapper";

	@Override
	public void insertProject(ProjectVO vo) throws Exception {
		session.insert(namespace + ".insertProject", vo);
	}

	@Override
	public List<ProjectVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public ProjectVO read(Integer projectno) throws Exception {
		return session.selectOne(namespace+".read", projectno);
	}

	@Override
	public void update(ProjectVO vo) throws Exception {
		session.update(namespace+".update", vo);
		
	}

	@Override
	public void delete(Integer projectno) throws Exception {
		session.delete(namespace+".delete", projectno);
		
	}

}
