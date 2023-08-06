package METHODS;
import DAO.companyimpldao;

public class dispalycompany {
	public static void main(String[] args) {
		System.out.println("list");
		companyimpldao a = new companyimpldao();
		a.display();
	}
}
