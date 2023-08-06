package DTO;

public class carImpl implements car{
  String car_id;
  String model_name;
  int price;
  int total_seats;
  String company_id;
  
public carImpl(String car_id, String model_name, int price, int total_seats, String company_id) {
	this.car_id = car_id;
	this.model_name = model_name;
	this.price = price;
	this.total_seats = total_seats;
	this.company_id = company_id;
}

public String getCar_id() {
	return car_id;
}

public void setCar_id(String car_id) {
	this.car_id = car_id;
}

public String getModel_name() {
	return model_name;
}

public void setModel_name(String model_name) {
	this.model_name = model_name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getTotal_seats() {
	return total_seats;
}

public void setTotal_seats(int total_seats) {
	this.total_seats = total_seats;
}

public String getCompany_id() {
	return company_id;
}

public void setCompany_id(String company_id) {
	this.company_id = company_id;
}

@Override
public String toString() {
	return "car_id=" + car_id + ", model_name=" + model_name + ", price=" + price + ", total_seats="
			+ total_seats + ", company_id=" + company_id ;
}
  
}
