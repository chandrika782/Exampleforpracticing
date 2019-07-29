package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Example;
import com.example.service.ExampleService;

@RestController
@RequestMapping("/exampleDetails")
public class ExampleController {
 @Autowired
  ExampleService exampleService;
 
 @PostMapping("/saveDetails")
 public Example saveDetails(@RequestParam Example example) {
	return exampleService.saveDetails(example);
	 
 }
 
 @GetMapping("/getDetails")
 public List<Example> getDetails() {
		return exampleService.getDetails();
	 }
 
 @GetMapping("/getDetailsById/{id}")
 public Example getDetailsById(@PathVariable("id") int id )
 {
	return exampleService.getDetailsById(id);
	 
 }
 
 @PutMapping("/updateDetails")
 public String updateDetails(@RequestParam Example example)
 {
	return exampleService.updateDetails(example);
	 
 }
 
 @DeleteMapping("/deleteDetails/{id}")
 public String deleteDetails(@PathVariable("id") int id)
 {
	 exampleService.deleteDetailsById(id);
	return "deleted successfully";
	 
 }
}
