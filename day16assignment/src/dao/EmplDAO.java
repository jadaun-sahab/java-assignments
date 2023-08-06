package dao;

import java.util.List;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

import DTO.EmployeeDTO;



public interface EmplDAO {
	void addNewEmployee(EmployeeDTO emp) throws SomethingWentWrongException;

	List<EmployeeDTO> getAccountDepartmentEmployee()throws NoRecordFoundException,SomethingWentWrongException;

}
