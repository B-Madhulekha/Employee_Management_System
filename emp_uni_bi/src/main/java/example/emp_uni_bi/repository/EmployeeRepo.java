package example.emp_uni_bi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import example.emp_uni_bi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
           @Query("select e from Employee e where name=?1")
           List<Employee> findByname(String name);
    
}
