package com.poc.project;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project,String> {

	public Project findByName(String name);
	

	public void delete(String name);

}
