package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

// 5 steps to execute jdbc query
// 1 -> loading the driver class
// 2 -> creating the connectino
// 3 -> creating the statement
// 4 -> processing the result
// 5 -> closing the connection
public class MyConnection {
	public static final String driverClassname = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/jdbc";
	public static final String username = "root";
	public static final String password = "faisal";
	public static void main(String[] args) {
		try {
//			loading the driver using the Class with forName method
			Class.forName(driverClassname);
			
//			creating the connection object using the getconnection method of DriverManager class
			Connection conn = DriverManager.getConnection(url, username, password);
			
//			using the isclosed method of connection to check whether the connection is open or closed
			if(conn.isClosed()) {
				System.out.println("connection is closed");
			}
			else
				System.out.println("connection is open");
			
//			checking whether connection is readonly or not
			boolean isReadOnly = conn.isReadOnly();
			System.out.println("connection is read only ? "+isReadOnly);
			
//			closing the connection
			conn.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
