package com.example.service;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	//实体管理器工厂
	static {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("test2");
		EntityManager entityManager = emfactory.createEntityManager();
		
		
	}
}
