package com.masai.day4.problem3.DAO;

import com.masai.day4.problem3.entites.Lawyer;

public interface CourtDAO {
	
		Lawyer findLawyerById(int id);
		String saveLawyer(Lawyer lawyer);
		public boolean deleteLawyerById(int id);
		String updateLawyerExperience(int id, int experience);

}