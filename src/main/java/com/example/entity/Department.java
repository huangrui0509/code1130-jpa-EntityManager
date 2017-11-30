package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {

	@Id
	private long id;
	private String name;
}
