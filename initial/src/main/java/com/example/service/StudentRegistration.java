package com.example.service;

import java.util.ArrayList;
import com.example.entity.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.StudentRepo;

@Service
public class StudentRegistration implements IStudentService {
	
/*private List<Student> studentRecords;
	
	private static StudentRegistration stdregd = null;
	
	StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	*/
	
    @Autowired
    private StudentRepo repository;

    @Override
    public List<Student> findAll() {

        return (List<Student>) repository.findAll();
    }
	
	/*
	public static StudentRegistration getInstance() {
		
	if (stdregd ==null) {
		stdregd = new StudentRegistration();
		return stdregd;
	 }
	else 
		return stdregd;
	}
	
	public void add(Student std) {
		studentRecords.add(std);
	}
	
	public String upDateStudent(Student std) {
		for(int i=0; i<studentRecords.size(); i++)
		        {
		            Student stdn = studentRecords.get(i);
		            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
		              studentRecords.set(i, std);//update the new record
		              return "Update successful";
		            }
		        }
		return "Update un-successful";
		}
		public String deleteStudent(String registrationNumber) {
		for(int i=0; i<studentRecords.size(); i++)
		        {
		            Student stdn = studentRecords.get(i);
		            if(stdn.getRegistrationNumber().equals(registrationNumber)){
		              studentRecords.remove(i);//update the new record
		              return "Delete successful";
		            }
		        }
		return "Delete un-successful";
		}
		    public List<Student> getStudentRecords() {
		    return studentRecords;
		    }
*/
    }
