package DTO;

public class companyImpl implements company {
String company_id;
String company_name;
int turnover_in_crores;
String registration_date;

public companyImpl(String company_id, String company_name, int turnover_in_crores, String registration_date) {
	this.company_id = company_id;
	this.company_name = company_name;
	this.turnover_in_crores = turnover_in_crores;
	this.registration_date = registration_date;
}

public String getCompany_id() {
	return company_id;
}

public void setCompany_id(String company_id) {
	this.company_id = company_id;
}

public String getCompany_name() {
	return company_name;
}

public void setCompany_name(String company_name) {
	this.company_name = company_name;
}

public int getTurnover_in_crores() {
	return turnover_in_crores;
}

public void setTurnover_in_crores(int turnover_in_crores) {
	this.turnover_in_crores = turnover_in_crores;
}

public String getRegistration_date() {
	return registration_date;
}

public void setRegistration_date(String registration_date) {
	this.registration_date = registration_date;
}

@Override
public String toString() {
	return "company_id=" + company_id + ", company_name=" + company_name + ", turnover_in_crores="
			+ turnover_in_crores + ", registration_date=" + registration_date ;
}

}
