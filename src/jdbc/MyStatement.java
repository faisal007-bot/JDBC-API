package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class MyStatement {
	public static void main(String[] args) {
		try {
			Class.forName(MyConnection.driverClassname);
			Connection conn = 
					DriverManager.getConnection
					(MyConnection.url, MyConnection.username, MyConnection.password);
//			creating the object of statement to execute static SQL queries using the 
//			createstatement method of the connection.
			Statement stmt  = conn.createStatement();
			
//			inserting , updating and deleting the row using the executeUpdate method of the
//			statement and it returns int 1--> if successfull
//			insertion
//			int status = stmt.executeUpdate("insert into student values(3,'neko','vegas')");
//			System.out.println(status+" student inserted");
			
//			updation
//			int status = stmt.executeUpdate
//					("update student set name='faisal khan',city='mumbai suburb' where id=1");
//			System.out.println(status+" student updated");
			
//			deletion
//			int status = stmt.executeUpdate("delete from student where id=1");
//			System.out.println(status+" student deleted");
			
//			fetching data using the executeQuery method of the statement which returns 
//			resultset object
			
//			fetching single row
//			ResultSet rs = stmt.executeQuery("select * from student where id=2");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
//			}
			
//			fetching multiple rows
//			ResultSet rs = stmt.executeQuery("select * from student");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
//			}
			
//			executing multiple queries using the addbatch and executebatch method of statement
			
//			adding multiple queries in the batch using the addbatch method of statement
			stmt.addBatch("insert into student values(4,'deadeye','algeria')");
			stmt.addBatch("insert into student values(1,'faisal','albania')");
			stmt.addBatch("insert into student values(5,'neko','jordan')");
			stmt.addBatch("insert into student values(6,'zero two','USA')");
			
//			executing all the queries set using the addbatch method
			stmt.executeBatch();
			System.out.println("batch processing done");
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
