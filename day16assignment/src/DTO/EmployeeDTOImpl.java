package DTO;



public class EmployeeDTOImpl implements EmployeeDTO {

	String empId;
	String ename;
	String address;
	String mobile;
	DeptDTO dept;
	
	public EmployeeDTOImpl(String empId, String ename, String address, String mobile, DeptDTO dept) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.dept = dept;
		}

	@Override
	public String getEmpId() {
		return empId;
	}

	@Override
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String getEname() {
		return ename;
	}

	@Override
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getMobile() {
		return mobile;
	}

	@Override
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	@Override
	public DeptDTO getDept() {
		return dept;
	}

	@Override
	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeDTOImpl [empI = " + empId + ", ename = " + ename + ", address = " + address + ", mobile = " + mobile
				+ ", deptid = " + dept.getDid() + ", deptName = " + dept.getDname() + ", deptLocation = " + dept.getLocation() + "]";
	}
	
}
