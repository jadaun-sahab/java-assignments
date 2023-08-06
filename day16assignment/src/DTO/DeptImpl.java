package DTO;



public class DeptImpl implements DeptDTO {
	String did;
	String dname;
	String location;

	public DeptImpl(String did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
		this.location = location;
	}

	@Override
	public String getDid() {
		return did;
	}

	@Override
	public void setDid(String did) {
		this.did = did;
	}

	@Override
	public String getDname() {
		return dname;
	}

	@Override
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", location=" + location + "]";
	}

}