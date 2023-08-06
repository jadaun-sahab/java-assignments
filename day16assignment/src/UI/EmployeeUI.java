package UI;

import java.util.List;
import java.util.Scanner;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

import DTO.DeptDTO;
import DTO.DeptImpl;
import DTO.EmployeeDTO;
import DTO.EmployeeDTOImpl;
import dao.EmplDAO;
import dao.EmplDAOImpl;



public class EmployeeUI {
	
	static void addDetailsOfEmpUI(Scanner sr) {
		System.out.println("Please Enter Employee Details.....");
		System.out.println("Enter Employee Id ");
		String empId = sr.next();
		System.out.println("Enter Employee Name ");
		String ename = sr.next();
		System.out.println("Enter City of Employee ");
		String address = sr.next();
		System.out.println("Enter Mobile Number ");
		String mobile = sr.next();
		System.out.println("Enter DepartmentID");
		String deptId = sr.next();

		DeptDTO deptDTO = new DeptImpl(deptId, null, null);
		EmployeeDTO emp = new EmployeeDTOImpl(empId, ename, address, mobile,deptDTO);

		EmplDAO empDAO = new EmplDAOImpl();

		try {
			empDAO.addNewEmployee(emp);
			System.out.println("Employee Added Sucessfully");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}
	}
	
	static void getAccountDeptEmployeeUI() {
		EmplDAO empDAO = new EmplDAOImpl();
		try {
			List<EmployeeDTO> list = empDAO.getAccountDepartmentEmployee();
			list.forEach(System.out::println);

		} catch (SomethingWentWrongException | NoRecordFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void deleteEmployeeBydeptId(Scanner sr) {
	}
}