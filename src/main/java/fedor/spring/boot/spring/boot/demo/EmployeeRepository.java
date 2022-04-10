package fedor.spring.boot.spring.boot.demo;

import fedor.spring.boot.spring.boot.demo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
