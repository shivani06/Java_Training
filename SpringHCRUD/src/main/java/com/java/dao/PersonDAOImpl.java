package com.java.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.java.model.Person;
@Repository
public class PersonDAOImpl implements PersonDAO{
	
	private static final Logger logger = 
			LoggerFactory.getLogger(PersonDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("person saved successfully,person details ="+p);
		
	}

	@Override
	public void updatePerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("person updated successfully,person details ="+p);
	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for(Person p : personsList) {
			logger.info("persons List::"+p);
		}
		return personsList;
	}

	@Override
	public Person getPersonbyId(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
	}
		
	}
	
