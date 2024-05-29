package edu.sabanciuniv.service;


import edu.sabanciuniv.entity.Employee;
import edu.sabanciuniv.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Autowowired yapabilmek icin
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }
    public boolean deleteEmployee(int id)
    {
        if(employeeRepository.existsById(id))
        {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepository.findById(id).get();
    }
    public Iterable<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
    public void updateEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }
}
