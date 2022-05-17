package ai.jobiak.emp.service;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.jobiak.emp.model.Employee;
import ai.jobiak.emp.repository.EmployeeRepository;


@Service
public class EmpService {

	@Autowired
	EmployeeRepository repo;
	
	public Employee addEmp(Employee emp)
	{
		Employee empobj=repo.save(emp);
		return empobj;
	}
	public Employee modifyEmp(Employee emp)
	{
		Employee empobj=repo.save(emp);
		return empobj;
	}
	
	//all delete
	public void deleteEmp(Employee emp)
	{
    repo.delete(emp);
	}

	/*
	 * //single delete public void removeEmpId(Long empId) { repo.deleteById(empId);
	 * //delete all,delete,delete by id }
	 */
	public void removeEmpName(String empName) {
		repo.deleteById(empName);
		//delete all,delete,delete by id
	}
	
	public List<Employee> saveAll(List<Employee> emp) {
		// TODO Auto-generated method stub
		return repo.saveAll(emp);
	
	}
	
}
