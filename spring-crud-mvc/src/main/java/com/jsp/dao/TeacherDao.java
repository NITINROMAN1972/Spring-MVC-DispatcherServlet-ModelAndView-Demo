package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Teacher;

@Component
public class TeacherDao {
   @Autowired
	EntityManagerFactory entityManagerFactory;
   
   public Teacher saveTeacher(Teacher teacher) {
	   EntityManager entityManager=entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction=entityManager.getTransaction();
	   
	   
	   entityTransaction.begin();
	   entityManager.persist(teacher);
	   entityTransaction.commit();
	   return teacher;
	   
   }
}
