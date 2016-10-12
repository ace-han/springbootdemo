package com.example.demo.module1.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module1.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
