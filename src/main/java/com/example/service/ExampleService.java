package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ExampleException;
import com.example.model.Example;
import com.example.repository.ExampleRepo;
@Service
public class ExampleService implements IExampleService {
	@Autowired
	ExampleRepo exampleRepo;

	@Override
	public Example saveDetails(Example example) {
		return exampleRepo.save(example);
	}

	@Override
	public List<Example> getDetails() {
		return exampleRepo.findAll();
	}

	@Override
	public Example getDetailsById(int id) {
		if(!exampleRepo.findById(id).isPresent())
				throw new ExampleException("exampleid is not exist");
		return exampleRepo.findById(id).get();
	}

	@Override
	public String updateDetails(Example example) {
		if(!exampleRepo.findById(example.getId()).isPresent())
			throw new ExampleException("id is not exist");
		exampleRepo.save(example);

		return "updated successfully";
	}

	@Override
	public String deleteDetailsById(int id) {
		if(!exampleRepo.findById(id).isPresent())
			throw new ExampleException("id is not exist");
		exampleRepo.deleteById(id);
		
		return "deleted successfully";
	}

}
