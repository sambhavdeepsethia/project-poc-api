package com.poc.project;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> getAllProjects(){
		
		List<Project> projects = new ArrayList<>();
		projectRepository.findAll().forEach(projects::add);
		return projects;
	}
	
	public Project getProject(String name) {
		
		return projectRepository.findByName(name);
	}
	
	public void addProject(Project project){
		projectRepository.save(project);
	}
	
	public void updateProject(String name, Project project) {
		projectRepository.save(project);
	}
	public void deleteProject(String name) {
		projectRepository.delete(name);
	}
	
}
