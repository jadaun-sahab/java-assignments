package UI;

import java.util.List;
import java.util.Scanner;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

import DTO.DeptDTO;
import DTO.DeptImpl;
import dao.DeptDAO;
import dao.DeptDAOImpl;



public class DepartUI {
	 static void addDetailsOfDepart(Scanner sr) {
	System.out.println("Please Enter Department Details Here");
	System.out.println("Enter Department Id ");
	String did = sr.next();
	System.out.println("Enter Department Name ");
	String dname = sr.next();
	System.out.println("Enter Location of Department ");
	String address = sr.next();

	DeptDTO dept = new DeptImpl(did, dname, address);
	DeptDAO deptDAO = new DeptDAOImpl();
	try {
		deptDAO.addNewDepart(dept);
		System.out.println("Department is added sucessfully");
	} catch (SomethingWentWrongException e) {
		System.out.println(e);
	}
}

static void getDepartDetailsByEmplLocationUI() {
DeptDAO deptDAO = new DeptDAOImpl();
try {
	List<DeptDTO> list = deptDAO.getDepartByEmployeeLocation();
	list.forEach(System.out::println);

} catch (SomethingWentWrongException | NoRecordFoundException e) {
	System.out.println(e.getMessage());
}

}

}