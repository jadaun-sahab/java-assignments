package com.masai.evaluation.problem1.connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtils {
	 private static EntityManagerFactory emf;

	    static {
	        emf = Persistence.createEntityManagerFactory("product-unit");
	    }

	    public static EntityManager provideEntityManager(){
	        return emf.createEntityManager();
	    }

		public static EntityManager getConnection() {
			return emf.createEntityManager();
			
		}

		
}
