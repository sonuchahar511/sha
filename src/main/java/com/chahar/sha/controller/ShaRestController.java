package com.chahar.sha.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chahar.sha.model.Student;
import com.chahar.sha.model.StudentList;

@RestController
public class ShaRestController {
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
		if (id == 2)
			return new ResponseEntity<Student>((new Student(2, "Student2", 22)), HttpStatus.OK);

		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/allstudents", method = RequestMethod.GET)
	public StudentList getAllStudents() {
		System.out.println("asdfasdf");
		Student student1 = new Student(1, "Student1", 11);
		Student student2 = new Student(2, "Student2", 22);
		Student student3 = new Student(3, "Student3", 33);
		Student student4 = new Student(4, "Student4", 44);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);

		StudentList sl = new StudentList();
		sl.setStudentList(studentList);

		return sl;
	}

	@RequestMapping(value = "/student/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>((new Student(student.getId(), student.getName() + " :modified", 22)),
				HttpStatus.OK);

	}
}