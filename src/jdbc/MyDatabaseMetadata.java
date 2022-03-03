package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class MyDatabaseMetadata {
	public static void main(String[] args) {
		try {
			Class.forName(MyConnection.driverClassname);
			Connection conn = 
					DriverManager.getConnection
						(MyConnection.url, MyConnection.username, MyConnection.password);
//			connection object is used to get the object of DatabaseMetadata
//			getMetadata method of connection is used to get the object of databasemetadata
			DatabaseMetaData dbmeta = conn.getMetaData();
			
//			several useful methods of the databasemetadata
//			it contains various methods related to database to get the database specific information
			System.out.println(dbmeta.getConnection());
			System.out.println(dbmeta.getDatabaseMajorVersion());
			System.out.println(dbmeta.getDatabaseProductName());
			System.out.println(dbmeta.getDatabaseProductVersion());
			System.out.println(dbmeta.getDriverName());
			System.out.println(dbmeta.getDriverVersion());
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
