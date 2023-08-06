package com.masai.evalution.problem1.DAO;

import com.masai.evalution.problem1.DTO.Applicant;

public interface JobPortalDAO {
		Applicant findApplicantById(int id); 
		String saveApplicant(Applicant applicant);    
		String deleteApplicantById(int id);
		String updateApplicantExperience(int id, int experience); 
}