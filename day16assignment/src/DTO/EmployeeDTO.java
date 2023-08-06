package DTO;


public interface EmployeeDTO {
	public String getEmpId();

	public void setEmpId(String empId);

	public String getEname();

	public void setEname(String ename);

	public String getAddress();

	public void setAddress(String address);

	public String getMobile();

	public void setMobile(String mobile);
	
	public DeptDTO getDept();

	public void setDept(DeptDTO dept);
}
