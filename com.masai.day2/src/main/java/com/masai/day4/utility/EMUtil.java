package com.masai.day4.utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("product-unit");
    }

    public static EntityManager provideEntityManager(){
        return emf.createEntityManager();
    }
}
