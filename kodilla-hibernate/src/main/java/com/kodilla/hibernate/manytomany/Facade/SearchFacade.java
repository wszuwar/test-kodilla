package com.kodilla.hibernate.manytomany.Facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> processSearchCompany(String name) throws NotFoundExeption {

        LOGGER.info("Searching for Company");

        List<Company> retrievedCompanies = companyDao.findByAnyPartOfNameCompany(name);

        for (Company company : retrievedCompanies) {
            LOGGER.info("Company was found : " + company.getName());
        }
        if (retrievedCompanies.isEmpty()) {
            LOGGER.error(NotFoundExeption.ERR_GET_COMPANIES_ERROR);
            throw new NotFoundExeption(NotFoundExeption.ERR_GET_COMPANIES_ERROR);
        }
        return retrievedCompanies;
    }

    public List<Employee> processSearchEmployee(String lastName) throws NotFoundExeption {
        LOGGER.info("Searching for company");

        List<Employee> retrievedEmployes = employeeDao.findByAnyPartOfNameEmploye(lastName);
        for (Employee employee : retrievedEmployes) {
            LOGGER.info("Employee was found : " + employee.getFirstName() + " " + employee.getLastName());
        }
        if (retrievedEmployes.isEmpty()) {
            LOGGER.error(NotFoundExeption.ERR_GET_EMPLOEES_ERROR);
            throw new NotFoundExeption(NotFoundExeption.ERR_GET_EMPLOEES_ERROR);
        }
        return retrievedEmployes;
    }

}
