package edu.sabanciuniv.controller;


import edu.sabanciuniv.entity.Employee;
import edu.sabanciuniv.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public String createEmployee(@RequestBody Employee employee)
    {

        employeeService.addEmployee(employee);
        return "Employee Created";
    }

    @PostMapping("/createEmployeeWithPathVariable/{name}/{lname}")
    public String createEmployeeWithPathVariable(@PathVariable("name") String name,
                                                @PathVariable("lname") String lname)
    {
        Employee employee = new Employee(0,name,lname);
        employeeService.addEmployee(employee);
        return "Employee Created With PathVariable ";
    }

    @PostMapping("/createEmployeeWithQueryVariable")
    public String createEmployeeWithQueryVariable(@RequestParam("name") String name,
                                                 @RequestParam("lname") String lname)
    {
        Employee employee = new Employee(0,name,lname);
        employeeService.addEmployee(employee);
        return "Employee Created With QueryVariable ";
    }

    @PostMapping("/createEmployeeWithForm")
    public String createEmployeeWithForm(@RequestParam("name") String name,
                                         @RequestParam("lname") String lname)
    {
        Employee employee = new Employee(0,name,lname);
        employeeService.addEmployee(employee);
        return "Employee Created With Form ";
    }
}
