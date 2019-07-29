package com.example.service;

import java.util.List;

import com.example.model.Example;

public interface IExampleService {

	public Example saveDetails(Example example);
	
	public List<Example> getDetails();
	
	public Example getDetailsById(int id);
	
	public String updateDetails(Example example);
	
	public String deleteDetailsById(int id);
	
	
}
