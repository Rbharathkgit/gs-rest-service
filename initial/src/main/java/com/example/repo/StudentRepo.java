package com.example.repo;

import com.example.entity.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {

	
}