package example.emp_uni_bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.emp_uni_bi.model.Company;
import example.emp_uni_bi.repository.CompanyRepo;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    public Company postCompany(Company company){
        return companyRepo.save(company);
    } 
}
