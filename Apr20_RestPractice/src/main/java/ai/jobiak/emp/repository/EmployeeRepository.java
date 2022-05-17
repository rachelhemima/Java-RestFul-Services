package ai.jobiak.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ai.jobiak.emp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String>{



}
