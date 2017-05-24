package com.dgit.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectVO {
	private Integer projectno;
	private String projectname;
	private String projectcontents;
	private Date startdate;
	private Date enddate;
	private String projectstate;
	
	public Integer getProjectno() {
		return projectno;
	}
	public void setProjectno(Integer projectno) {
		this.projectno = projectno;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectcontents() {
		return projectcontents;
	}
	public void setProjectcontents(String projectcontents) {
		this.projectcontents = projectcontents;
	}
	public Date getStartdate() {
		return startdate;
	}
	
	public String getsDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		return sdf.format(startdate);
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	
	public String geteDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(enddate);
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getProjectstate() {
		return projectstate;
	}
	public void setProjectstate(String projectstate) {
		this.projectstate = projectstate;
	}
	
	@Override
	public String toString() {
		return "ProjectVO [projectno=" + projectno + ", projectname=" + projectname + ", projectcontents="
				+ projectcontents + ", startdate=" + startdate + ", enddate=" + enddate + ", projectstate="
				+ projectstate + "]";
	}
	
	
	
}
