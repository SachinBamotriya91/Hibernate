package jdbc_prc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_Task {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
		
		Statement st = con.createStatement();
		
		st.execute("insert into employee values(1,'Raja',)");
		
		con.close();


	}

}
