package ai.jobiak.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ai.jobiak.empapi.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}

