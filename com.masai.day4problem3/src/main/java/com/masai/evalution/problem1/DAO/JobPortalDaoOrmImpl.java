package com.masai.evalution.problem1.DAO;

import com.masai.evaluation.problem1.connection.EMUtils;
import com.masai.evalution.problem1.DTO.Applicant;

import jakarta.persistence.EntityManager;

public class JobPortalDaoOrmImpl implements JobPortalDAO{

	@Override
	public Applicant findApplicantById(int id) {
		Applicant ap= null;
		EntityManager em = EMUtils.getConnection();
		ap = em.find(Applicant.class, id);
		em.close();
		return ap;
	}

	@Override
	public String saveApplicant(Applicant applicant) {
		String ap = "something went wrong";
		EntityManager em = EMUtils.getConnection();
		em.getTransaction().begin();
		em.persist(applicant);
		em.getTransaction().commit();
		ap ="saved successfully";
		return ap;
	}

	@Override
	public String deleteApplicantById(int id) {
		String ap = "something went wrong";
		EntityManager em = EMUtils.getConnection();
		Applicant ap1= em.find(Applicant.class, id);
		if(ap1 !=null) {
			em.getTransaction().begin();
			em.remove(ap1);
			em.getTransaction().commit();
			ap ="deleted successfully";
			em.close();
		}
		
		return ap;
		
	}

	@Override
	public String updateApplicantExperience(int id, int experience) {
		String ap = "something went wrong";
		EntityManager em = EMUtils.getConnection();
		Applicant ap1= em.find(Applicant.class, id);
		if(ap1 !=null) {
			em.getTransaction().begin();
			ap1.setExperience(experience);
			em.getTransaction().commit();
			ap ="updated successfully";
			em.close();
		}
		
		return ap;
	}

}

