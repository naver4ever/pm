package com.dgit.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dgit.domain.ProjectVO;
import com.dgit.service.ProjectService;

@Controller
@RequestMapping("/project/*")
public class ProjectController {
	
	@Inject
	ProjectService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		logger.info("list GET..........................");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public void regissterGET(ProjectVO vo, Model model){
		logger.info("registerGET..........................");
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerPost(ProjectVO vo, String sdate, String edate) throws Exception{
		logger.info("registerProject..........................");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		vo.setStartdate(sdf.parse(sdate));
		vo.setEnddate(sdf.parse(edate));
		service.register(vo);
		return "redirect:/project/list";
	}
	
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public void readProject(Integer projectno, Model model) throws Exception{
		logger.info("readProject..........................");
		model.addAttribute("ProjectVO", service.read(projectno));
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String deleteProject(Integer projectno) throws Exception{
		logger.info("deleteProject..........................");
		service.delete(projectno);
		return "redirect:/project/list";
	}
	
	@RequestMapping(value="modify", method=RequestMethod.GET)
	public void updateFrom(Integer projectno, Model model) throws Exception{
		logger.info("updateFrom..........................");
		model.addAttribute("updateProject", service.read(projectno));
	}
	
	@RequestMapping(value="modify", method=RequestMethod.POST)
	public String update(ProjectVO vo, String sdate, String edate, RedirectAttributes rt) throws Exception{
		logger.info("updatePost..........................");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		vo.setStartdate(sdf.parse(sdate));
		vo.setEnddate(sdf.parse(edate));
		service.modify(vo);
		
		rt.addAttribute("projectno", vo.getProjectno());
		
		return "redirect:/project/detail";
	}

}
