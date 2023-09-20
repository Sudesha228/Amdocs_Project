package com.training.spring.course.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseId;
	private String courseName;
	private int courseCredit;
	
	public Course(long courseId, String courseName,int courseCredit) {
//		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCredit = courseCredit;
	}
}

