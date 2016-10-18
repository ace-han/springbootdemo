package com.example.demo.academic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="ACADEMIC_STUDENT", 
indexes = { @Index(name = "STUDENT_IDX1", columnList = "firstName", unique=true) }
)
public class Student {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(length=128)
    private String firstName;
    
	@Column(length=128)
    private String lastName;
    
}
