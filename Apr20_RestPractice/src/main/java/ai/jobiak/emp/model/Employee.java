package ai.jobiak.emp.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
private Long empId;
@Id
private String empName;
private double empSal;

public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
	
}
