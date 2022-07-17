package manyToone_uni.test;

import manyToone_uni.dto.Company;
import manyToone_uni_dao.CompanyDao;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyDao cd = new CompanyDao();
		
//		System.out.println("**********************FindCompnayById Started***************************");
//		Company company  =cd.findCompanyById(1001);
//		System.out.println(company);
//		System.out.println("**********************FindCompnayById Ended***************************");
//		
//		System.out.println("**********************FindAllCompany Started***************************");
//		cd.findAllCompanyies();
//		System.out.println("**********************FindCompnayById Ended***************************");
		
//		
//		System.out.println("**********************UpdateCompany Started***************************");
//		company.setAddress("Indore India");
//		cd.updateCompany(company);
//		
//		System.out.println("**********************Update Company Ended***************************");
//		
//		
		
//		Company company1 =new Company();
//
//
//		company1.setCid(1002);
//		company1.setCname("Amazon");
//		company1.setAddress("Bengaluru India");
//		company1.setCeo("jerre L. Stead");
//		company1.setRevanue(1250000000);
//		
//		cd.saveCompany(company1);
		
		cd.deleteCompany(1002);
	
	}

}
