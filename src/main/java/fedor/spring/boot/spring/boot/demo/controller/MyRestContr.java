package fedor.spring.boot.spring.boot.demo.controller;


import fedor.spring.boot.spring.boot.demo.EmployeeService;
import fedor.spring.boot.spring.boot.demo.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MyRestContr {
  private  final EmployeeService employeeService;

@GetMapping("/employees")
    public List<Employee> showAllEmployees()
    {
        return employeeService.getAllEmployees();
    }
 @GetMapping("/employees/{id}")
 public Optional<Employee> getEmployee(@PathVariable String id) {
     return employeeService.getId(id);

 }
@PostMapping("/employees")
 public Employee addNewEmployee(@RequestBody Employee employee)
 {
     employeeService.addEmployee(employee);
return employee;
  }
  @PutMapping("/employees")
   public Employee updateEmployee(@RequestBody Employee employee)
   {
       employeeService.update(employee);

      return employee;
  }
  @DeleteMapping("/employees/{id}")
  public String deleteEmployee(@PathVariable String id)
  {
employeeService.delete(id);
   return "Employee with id = "+id+" was delete";
  }

}
