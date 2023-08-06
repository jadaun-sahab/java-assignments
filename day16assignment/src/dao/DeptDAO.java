package dao;

import java.util.List;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

import DTO.DeptDTO;



public interface DeptDAO {
	public void addNewDepart(DeptDTO dept) throws SomethingWentWrongException;

	public List<DeptDTO> getDepartByEmployeeLocation() throws NoRecordFoundException,SomethingWentWrongException;

}
