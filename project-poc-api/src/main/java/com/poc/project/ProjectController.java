package com.poc.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(method=RequestMethod.GET, value="/projects")
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/projects/{name}")
	public Project getProject(@PathVariable String name){
		return projectService.getProject(name);
	}
	@RequestMapping(method=RequestMethod.POST, value="/projects")
	public void addProject(@RequestBody Project project){
		 projectService.addProject(project);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{name}")
	public void updateProject(@RequestBody Project project, @PathVariable String name){
		projectService.updateProject(name, project);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{name}")
	public void deleteProject(@PathVariable String name){
		projectService.deleteProject(name);
	}
	
	

}
