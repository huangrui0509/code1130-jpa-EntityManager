package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	private long id;
	
    private String name;
    private long salary;
    public Employee() {}
    public Employee(int id) { this.id = id; }
}