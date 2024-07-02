package com.example.demo.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="COURSE_INFO")
public class Course {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer cid;
	private String name;
	private Long price;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Course(Integer cid, String name, Long price) {
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", price=" + price + "]";
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	}
