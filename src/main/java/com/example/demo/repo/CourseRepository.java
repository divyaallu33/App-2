package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

	

}
