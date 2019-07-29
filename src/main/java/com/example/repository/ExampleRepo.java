package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Example;
@Repository
public interface ExampleRepo extends JpaRepository<Example, Integer>{

}
