package com.kodilla.hibernate.manytomany.dao.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.Facade.NotFoundExeption;
import com.kodilla.hibernate.manytomany.Facade.SearchFacade;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    SearchFacade searchFacade;

    @Test
    public void searchCompanyAndEmployeeByPartOfName() throws NotFoundExeption {
        //Given

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

    softwareMachine.getEmployees().add(johnSmith);
    dataMaesters.getEmployees().add(stephanieClarckson);
    dataMaesters.getEmployees().add(lindaKovalsky);
    greyMatter.getEmployees().add(johnSmith);
    greyMatter.getEmployees().add(lindaKovalsky);

    johnSmith.getCompanies().add(softwareMachine);
    johnSmith.getCompanies().add(greyMatter);
    stephanieClarckson.getCompanies().add(dataMaesters);
    lindaKovalsky.getCompanies().add(dataMaesters);
    lindaKovalsky.getCompanies().add(greyMatter);



        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);


         String partOfCompanyName = "Sof";
        String partOfCompanyName1 = "ers";
        //When
         List<Company> retrievedCompanies =  searchFacade.processSearchCompany(partOfCompanyName);
        List<Company> retrievedCompanies1 = searchFacade.processSearchCompany(partOfCompanyName1);
        List<Employee> retrievedEmployee = searchFacade.processSearchEmployee("kson");


        //Then
         Assert.assertEquals(1, retrievedCompanies1.size());
        Assert.assertEquals("Software Machine",retrievedCompanies.get(0).getName());
        Assert.assertEquals(1,retrievedEmployee.size());


        //Clean UP
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);


    }

}


