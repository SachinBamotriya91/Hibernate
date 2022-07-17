package manyToone_uni.test;
import manyToone_uni.dto.Company;
import manyToone_uni.dto.Employee;
import manyToone_uni_dao.CompanyDao;
import manyToone_uni_dao.EmployeeDao;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Company company =new Company();


		company.setCid(1001);
		company.setCname("Clarivate Analytics");
		company.setAddress("Bengaluru India");
		company.setCeo("jerre L. Stead");
		company.setRevanue(1250000000);
		
		CompanyDao cd = new CompanyDao();
		//Company company  =cd.findCompanyById(1001);
		
		
		
		Employee emp1 = new Employee();
		emp1.setEmpid(4);
		emp1.setName("Sachin");
		emp1.setAddress("Indore");
		emp1.setPhone(880000000);
		emp1.setSalary(12345);
		emp1.setRole("ASE");
		emp1.setCompany(company);
		
		
		Employee emp2 = new Employee();
		emp2.setEmpid(5);
		emp2.setName("Rajesh");
		emp2.setAddress("Chennai");
		emp2.setPhone(999954320);
		emp2.setSalary(54321);
		emp2.setRole("SE");
		emp2.setCompany(company);
		
		Employee emp3 = new Employee();
		emp3.setEmpid(6);
		emp3.setName("Nalin");
		emp3.setAddress("Delhi");
		emp3.setPhone(787654321);
		emp3.setSalary(10283);
		emp3.setRole("SSE");
		emp3.setCompany(company);
		
//		CompanyDao cd = new CompanyDao();
//		cd.saveCompany(company);
		
		EmployeeDao ed = new EmployeeDao();
		ed.saveEmployee(emp1);
		ed.saveEmployee(emp2);
		ed.saveEmployee(emp3);
		
	}

}
