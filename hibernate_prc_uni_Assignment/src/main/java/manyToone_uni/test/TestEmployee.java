package manyToone_uni.test;

import java.util.List;
import java.util.Scanner;

import manyToone_uni.dto.Company;
import manyToone_uni.dto.Employee;
import manyToone_uni_dao.CompanyDao;
import manyToone_uni_dao.EmployeeDao;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeDao ed =new EmployeeDao();
		
//		System.out.println("Enter your chhoice");
//		
//		System.out.println("1.FindAll Employees");
//		System.out.println("2.Enter Employee Id to get Employee");
//		System.out.println("3.Enter Employee Details to be updated");
//		System.out.println("4.Enter Employee Id to Delete Employee");
//		System.out.println("5.Exit");
//		Scanner sc =new Scanner(System.in);
//		
//		int choice = sc.nextInt();
//		while(true) {
//		switch (choice) {
//		case 1:{
//			System.out.println("************************Find All Started*****************************************");
//			List<Employee> list = ed.findAllEmployees();
//			
//			for(Employee emp : list) {
//				System.out.println(emp);
//			}
//			
//		}
//		break;
//		case 2:{
//			System.out.println("Please enter Employee Id");
//			int id =sc.nextInt();
//			Employee emp = ed.findEmployeeById(id);
//			System.out.println(emp);
//		}
//		break;
//		case 3:{
//			System.out.println("Enter EMP Id to update ");
//			int id = sc.nextInt();
//			
//			Employee emp = ed.findEmployeeById(id);
//			emp.setName("Raj Kumar");
//			ed.updateEmployee(emp);
//		
//		}
//		break;
//		case 4:{
//			System.out.println("Enter EMP Id to delete Employee ");
//			int id = sc.nextInt();
//			ed.deleteEmployee(id);
//			
//		}
//		break;
//		case 5:{
//			System.exit(0);
//		}
//		
//		}
		
//		System.out.println("**********************FindAll Started***************************");
//		ed.findAllEmployees();
//		System.out.println("**********************FindAll End***************************");
		
		
//		System.out.println("**********************FindEmployeeById Started***************************");
//
		/*Employee employee=ed.findEmployeeById(empid);
		System.out.println(employee);
		
		System.out.println("**********************Company Details using Employee Started***************************");
		Company company =  employee.getCompany();
		System.out.println(company);
	
		System.out.println("**********************Company Details using Employee Ended***************************");
*/
//		
//		System.out.println("**********************FindEmployeeById End***************************");
//		
//		
//		System.out.println("*********************UpdateEmployeeById Started");
////	
//		Employee emp1 = new Employee();
//		emp1.setEmpid(4);
//		emp1.setName("Nilesh");
//		emp1.setAddress("Depalpur");
//		emp1.setPhone(880000000);
//		emp1.setSalary(12345);
//		emp1.setRole("ASE");
//		emp1.setCompany(company);
//		ed.updateEmployee(emp1);
//		
////		
//		System.out.println("*********************UpdateEmployeeById Ended");
		/*
		 * System.out.println("*********************deleteEmployee Started");
		 * ed.deleteEmployee(5);
		 * System.out.println("*********************deleteEmployee Ended");
		 */
		
		
		
		
		}
	}

