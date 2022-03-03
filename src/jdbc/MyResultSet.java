package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class MyResultSet {
	public static void main(String[] args) {
		try {
			Class.forName(MyConnection.driverClassname);
			Connection conn = 
					DriverManager.getConnection
						(MyConnection.url, MyConnection.username, MyConnection.password);
//			resultset object is used to get the data from the database
//			it contains various methods for processing
//			we can get the resultset object from both statement and preparedstatement
			PreparedStatement stmt = 
					conn.prepareStatement
//					we need to set these properties to move into both directions inside the table
//					it contains static constants and we need to  use these constants
						("select * from student",
								ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			getting the object of resultset using the executeQuery method of
//			both statement and preparedstatement
			ResultSet rs = stmt.executeQuery();
//			previous method is used to move to the previous row it returns row in reverse order
//			next method is used to move  to the next row
//			absolute method is used to set the row number from the initial row 
//			0 indicates first and so on
//			relative method is used to set the row number relative to the current row 
//			on which the resultSet object is pointing
			rs.absolute(2);
			rs.relative(1);
			while(rs.previous()) {
//				while(rs.next()) {
//				getInt method of resultset is used to get the number datatype
//				getString method of the resultSet is used to get the String datatype
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
