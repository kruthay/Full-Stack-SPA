// Controller file for the Student application - back end



package com.example.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.repository.studentrepositary;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.student;
@RestController

@RequestMapping("/api/v1/")
public class studentController {
	@Autowired
	private studentrepositary studentresp;
	@CrossOrigin(origins = "http://ec2-3-230-0-28.compute-1.amazonaws.com:30977")
	@GetMapping("/students")
	public List<student> getALLStudents(){
		return studentresp.findAll();
	}
	// create student rest api
	@PostMapping("/students")
	@CrossOrigin(origins = "http://ec2-3-230-0-28.compute-1.amazonaws.com:30977")
	public student createStudent(@RequestBody student Student) {
			return studentresp.save(Student);
	}
	
	//get student
	
	@GetMapping("/students/{id}")
	@CrossOrigin(origins = "http://ec2-3-230-0-28.compute-1.amazonaws.com:30977")
	public ResponseEntity<student> getStudentByID(@PathVariable Long id) {
		student Student = studentresp.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student doesn't exist"));
		return ResponseEntity.ok(Student);
	}
	
	//update employee
	@PutMapping("/students/{id}")
	@CrossOrigin(origins = "http://ec2-3-230-0-28.compute-1.amazonaws.com:30977")
	public ResponseEntity<student> updateEmployee(@PathVariable Long id, @RequestBody student StudentDetails){
		student Student = studentresp.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student doesn't exist"));
		Student.setFname(StudentDetails.getFname());
		Student.setLname(StudentDetails.getLname());
		Student.setEmail(StudentDetails.getEmail());
		Student.setAddress(StudentDetails.getAddress());
		Student.setCity(StudentDetails.getCity());
		Student.setZip(StudentDetails.getZip());
		Student.setState(StudentDetails.getState());
		Student.setPhone(StudentDetails.getPhone());
		Student.setDate(StudentDetails.getDate());
		Student.setRuffle(StudentDetails.getRuffle());
		Student.setCampus(StudentDetails.getCampus());
		Student.setCampus1(StudentDetails.getCampus1());
		Student.setCampus2(StudentDetails.getCampus2());
		Student.setCampus3(StudentDetails.getCampus3());
		Student.setCampus4(StudentDetails.getCampus4());
		Student.setCampus5(StudentDetails.getCampus5());
		Student.setKnow(StudentDetails.getKnow());
		Student.setComment(StudentDetails.getComment());
		Student.setRating(StudentDetails.getRating());
		Student.setRating1(StudentDetails.getRating1());
		Student.setRating2(StudentDetails.getRating2());
		Student.setRating3(StudentDetails.getRating3());
		
		student updatedStudent = studentresp.save(Student);
		return ResponseEntity.ok(updatedStudent);

	}
	
	@DeleteMapping("/student/{id}")
	@CrossOrigin(origins = "http://ec2-3-230-0-28.compute-1.amazonaws.com:30977")
	public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id){
		student Student = studentresp.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student doesn't exist"));
		
		studentresp.delete(Student);
		Map<String, Boolean> response= new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
		
	}
}
