package com.example.demo.academic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="ACADEMIC_DEPARTMENT", 
indexes = { @Index(name = "DEPART_IDX1", columnList = "name", unique=true) }
)
public class Department {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=128)
    private String name;
	
	@Column(length=256)
    private String location;
	
}
