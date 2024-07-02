package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Course;
import com.example.demo.repo.CourseRepository;
@Service
public class CourseService1 implements CourseService{
	@Autowired
private CourseRepository repo;
	@Override
	public String upsert(Course course) {
		repo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> id = repo.findById(cid);
		if(id.isPresent())
		{
			return id.get();
		}else
		{
			return null;
		
		}}
	

	@Override
	public List<Course> getAllCourses() {
		repo.findAll();
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(repo.existsById(cid)) {
			repo.deleteById(cid);
			return "items are deleted";
		}
		return "no record are found";
	}

}
