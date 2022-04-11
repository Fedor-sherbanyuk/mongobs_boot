package fedor.spring.boot.spring.boot.demo;

import fedor.spring.boot.spring.boot.demo.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
    public Optional<Employee> getId(String id)
    {
        return employeeRepository.findById(id);
    }
    public Employee addEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public Employee update(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public void delete(String id)
    {
       employeeRepository.deleteById(id);
    }

}
