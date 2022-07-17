package jdbc_prc_day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExecution {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
			String sql="insert into students values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			Scanner sc =  new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc .next();
				System.out.println("Enter age");

				int age = sc.nextInt();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.addBatch();

		}
			ps.executeBatch();
			con.close();

}
	
}