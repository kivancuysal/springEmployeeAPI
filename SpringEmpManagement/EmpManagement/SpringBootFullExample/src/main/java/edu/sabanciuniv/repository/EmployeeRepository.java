package edu.sabanciuniv.repository;

import edu.sabanciuniv.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{

}
