package no.hvl.dat250.jpa.assignment2;

import java.util.List;

import javax.persistence.Query;

import javax.persistence.EntityManager;

public class pObjectRetriever {

	public <T> void printFromDB(EntityManager em, String className) {
		// Retrieve persisted objects from db, print them and show size
		
		// Construct query
		String query = "select x from "+className+" x";
		
		Query q = em.createQuery(query);
		List<T> xObjects = q.getResultList();
		for (T xObj: xObjects) {
			System.out.println(xObj);
			}
		
		System.out.println(className+" instances: " + xObjects.size());
	}
	
}
