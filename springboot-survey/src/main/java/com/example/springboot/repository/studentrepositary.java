// Repository file for the Student application - back end

package com.example.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.student;

@Repository
public interface studentrepositary extends JpaRepository<student, Long> {
	 
}
