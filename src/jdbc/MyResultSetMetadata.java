package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MyResultSetMetadata {
	public static void main(String[] args) {
		try {
			Class.forName(MyConnection.driverClassname);
			Connection conn = 
					DriverManager.getConnection
						(MyConnection.url,MyConnection.username,MyConnection.password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
//			we need to use the resultset object to get the object of resultSetMetadata
//			resultset getMetadata method is used to get the object of resultsetMetadata
			ResultSetMetaData rsmeta = rs.getMetaData();
			
//			several useful methods of resultsetMetadata
//			it contains various methods to get the data or information of the table
//			present inside the database
			System.out.println(rsmeta.getCatalogName(1));
			System.out.println(rsmeta.getColumnClassName(1));
			System.out.println(rsmeta.getColumnCount());
			System.out.println(rsmeta.getColumnName(2));
			System.out.println(rsmeta.getColumnType(3));
			System.out.println(rsmeta.getTableName(2));
			System.out.println(rsmeta.isReadOnly(1));
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
