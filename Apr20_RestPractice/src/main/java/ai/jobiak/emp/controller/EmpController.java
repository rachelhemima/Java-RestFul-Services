package ai.jobiak.emp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.jobiak.emp.model.Employee;
import ai.jobiak.emp.repository.EmployeeRepository;
import ai.jobiak.emp.service.EmpService;


@RestController
@RequestMapping("/employee")
public class EmpController 
{
	
    @Autowired
	EmployeeRepository repo;
   
    @Autowired
    EmpService service;
    
  @GetMapping(value="/info")
  public String introduction()
  {
  return new String("The #1 Manufactures of Digital Modiles in Asia");	
  }
  
@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE)
public Employee addEmployee(@RequestBody Employee emp) {
	Employee empobj=service.addEmp(emp);
	return empobj;
}

@PutMapping(value="/modify")	
public void modifyEmployee(@RequestBody Employee emp) {
	service.modifyEmp(emp);
}
@PutMapping(value="/modify1",consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE)	
public Employee modify1Employee(@RequestBody Employee emp) {
	Employee empobj= service.modifyEmp(emp);
	return empobj;
}
//delete all
@DeleteMapping(value="/delete")
public void deleteEmployee(@RequestBody Employee emp) {
	service.deleteEmp(emp);
}

/*
 * @DeleteMapping(value="/delete1") //public void
 * removeEmp(@PathVariable(value="empId")Long empId) { public void
 * removeEmpId(Long empId) { service.removeEmpId(empId); }
 */
@DeleteMapping(value="/delete1/{empName}")
public void remove(@PathVariable(value="empName")String empName) {
//public void remove(String empName) {
	service.removeEmpName(empName);
}
@PostMapping(value="/create1",consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE)
public List<Employee> add(@RequestBody List<Employee> emp1) {
	return service.saveAll(emp1);
	
}


}