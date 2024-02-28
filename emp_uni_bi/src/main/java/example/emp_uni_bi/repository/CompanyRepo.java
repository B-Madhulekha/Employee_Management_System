package example.emp_uni_bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.emp_uni_bi.model.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer>{

    
}
