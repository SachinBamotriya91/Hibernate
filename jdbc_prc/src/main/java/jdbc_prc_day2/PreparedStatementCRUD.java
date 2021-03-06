package jdbc_prc_day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementCRUD {
	public void saveTeacher() {
		Scanner sc =  new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc .next();
		int age = sc.nextInt();
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
			String sql="insert into students values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			int row = ps.executeUpdate();
			System.out.println("Number of row inserted "+row);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void deleteStudent() {
		Connection con = null;
		try {
			Scanner sc =  new Scanner(System.in);
			System.out.println("enter id to delete");
			int id = sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
			String sql="delete from students where id =?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int row = ps.executeUpdate();
			System.out.println("Number of row affected "+row);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void getAllTeacher() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
			String sql="select * from students";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print("Id :" + rs.getInt(1));
				System.out.print(" Name : "+rs.getString(2));
				System.out.print(" Age : "+ rs.getInt(3));
				System.out.println();
				 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void updateTeacher() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter id where u want to update");
		int id = sc.nextInt();
		System.out.println("enter new Name");

		String name = sc.next();
		
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
			String sql="update students set name=? where id =?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			int row = ps.executeUpdate();
			System.out.println("Number of row inserted "+row);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	
	
}
