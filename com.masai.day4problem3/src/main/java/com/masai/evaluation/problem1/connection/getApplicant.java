package com.masai.evaluation.problem1.connection;

import com.masai.evalution.problem1.DAO.JobPortalDAO;
import com.masai.evalution.problem1.DAO.JobPortalDAOJdbcImpl;
import com.masai.evalution.problem1.DAO.JobPortalDaoOrmImpl;

public class getApplicant {
public static JobPortalDAO getInstanceofjobportalDAO(String approach){
		
		if(!approach.equals("jdbc") && !approach.equals("orm")) {
			return null;
		}
		if(approach.equals("jdbc")) {
			return new JobPortalDAOJdbcImpl();
		}
		return new JobPortalDaoOrmImpl();
	}
}
