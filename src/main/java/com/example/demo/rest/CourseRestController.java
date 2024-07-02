package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseRestController {
	
	@Autowired
private CourseService courseServcie;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course ){
    String status =courseServcie.upsert(course);
    return new ResponseEntity<>(status,HttpStatus.CREATED);
	}

	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid){
		Course course=courseServcie.getById(cid);
		return new ResponseEntity<Course>(course, HttpStatus.OK);

	}
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseServcie.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course ){
    String status =courseServcie.upsert(course);
    return new ResponseEntity<>(status,HttpStatus.OK);
	}

	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
	String status=courseServcie.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}
}
