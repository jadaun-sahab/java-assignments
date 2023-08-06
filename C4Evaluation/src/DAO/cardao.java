package DAO;

public interface cardao {
public void  addcars( String car_id,String model_name,int price,int total_seats,String company_id);
public String updatecars(String car_id,String model_name,int price,int total_seats,String company_id);
public void deletecars();
void display();
}
