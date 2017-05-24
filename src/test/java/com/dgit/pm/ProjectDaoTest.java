package com.dgit.pm;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.ProjectVO;
import com.dgit.persistence.ProjectDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ProjectDaoTest {
	@Autowired
	private ProjectDAO dao;
	
	/*@Test
	public void testInsertProject() throws Exception{
		Date newDate = new Date();
		
		ProjectVO vo = new ProjectVO();
		
		vo.setProjectname("hak4");
		vo.setProjectcontents("룰루~");
		vo.setStartdate(newDate);
		vo.setEnddate(newDate);
		vo.setProjectstate("진행중");
		
		dao.insertProject(vo);
	}*/
	
	/*@Test
	public void testReadProject() throws Exception{
		ProjectVO vo = new ProjectVO();
		vo = dao.read(1);
		System.out.println("-------------------------[testReadProject()]-------------------------");
		System.out.println(vo.toString());
	}*/
	
	@Test
	public void testUpdateProject() throws Exception{
		Date newDate = new Date();
		
		ProjectVO vo = new ProjectVO();
		vo.setProjectno(3);
		vo.setProjectname("업데이트테스트");
		vo.setProjectcontents("ㅇㅋㄷㅋ");
		vo.setStartdate(newDate);
		vo.setEnddate(newDate);
		vo.setProjectstate("보류");
		dao.update(vo);
	}
	
	/*@Test
	public void testDeleteProject() throws Exception{
		dao.delete(8);
	}*/
	
	/*@Test
	public void testListBoard() throws Exception{
		System.out.println("=====================[testListBoard()]=========================");
		List<BoardVO> bList = dao.listAll();
		for(BoardVO vo : bList){
			System.out.println(vo);
		}
	}*/
	
	/*@Test
	public void testListPage() throws Exception{
		System.out.println("=====================[testListPage()]=========================");
		int page = 3;
		List<BoardVO> bList = dao.listPage(page);
		for(BoardVO vo : bList){
			System.out.println(vo);
		}
	}*/
	
	/*@Test
	public void testListCriteria() throws Exception{
		Criteria criteria = new Criteria();
		criteria.setPage(3);
		criteria.setPerPageNum(30);
		
		List<BoardVO> bList = dao.listCriteria(criteria);
		for(BoardVO vo : bList){
			System.out.println(vo);
		}
	}*/
	

	
	
}
