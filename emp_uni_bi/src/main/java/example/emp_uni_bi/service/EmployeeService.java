package example.emp_uni_bi.service;

import java.util.List;

// import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
// import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import example.emp_uni_bi.model.Employee;
import example.emp_uni_bi.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee postEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public Employee getEmployee(int id){
        return employeeRepo.findById(id).orElse(null);
    }
     public Page<Employee> getSortedemployeeByPage(int offset, int pageSize, String field) {
        PageRequest pageRequest = PageRequest.of(offset, pageSize,Sort.by(field));
        return employeeRepo.findAll(pageRequest);
    }
    public List<Employee> getByname(String name){
        return employeeRepo.findByname(name);
    }
}
