package example.emp_uni_bi.controller;

import java.util.List;

// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.emp_uni_bi.model.Company;
import example.emp_uni_bi.model.Employee;
import example.emp_uni_bi.service.CompanyService;
import example.emp_uni_bi.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CompanyService companyService;
    @PostMapping("/post")
    public Employee postEmployeeDetails(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }
    @PostMapping("/posts")
    public Company postEmployeeDetails(@RequestBody Company company){
        return companyService.postCompany(company);
    }
     @GetMapping("/get/{name}")
    public List<Employee> getByname(@PathVariable("name") String name) {
        return employeeService.getByname(name);
    }
    @GetMapping("/{offset}/{pagesize}/{field}")
    public Page<Employee> getSortedEmployeeByPage( @PathVariable int offset, @PathVariable int pagesize, @PathVariable String field) {
       return  employeeService.getSortedemployeeByPage(offset, pagesize, field);
       
    }
}
