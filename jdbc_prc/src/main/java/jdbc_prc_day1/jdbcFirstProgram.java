package jdbc_prc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;

public class jdbcFirstProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","Sachin@9171");
		
		Statement st = con.createStatement();
		
		//st.execute("insert into students values(5,'Raja',25)");
		ResultSet rs = st.executeQuery("select * from students");
		// return type boolean - execute -> insert update delete and return true for select and for  DML insert update delete it return false
		//executeUpdate - > return int  -no of of rows affected and insert 
		// executeQuery -> return object of ResultSet and  select  query can be used
		//next() return true if we have data into object and move the cursor to next element
		while(rs.next()) {
			System.out.print("Id :" + rs.getInt(1));
			System.out.print(" Name : "+rs.getString(2));
			System.out.print(" Age : "+ rs.getInt(3));
			System.out.println();
			 
		}
		con.close();
		
	}
	
}
