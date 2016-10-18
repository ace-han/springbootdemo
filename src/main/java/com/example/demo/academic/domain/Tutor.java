package com.example.demo.academic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="ACADEMIC_TUTOR", 
indexes = { @Index(name = "TUTOR_IDX1", columnList = "firstName", unique=true) }
)
public class Tutor {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(length=32)
    private String firstName;
	
	@Column(length=32)
    private String lastName;
    
}
