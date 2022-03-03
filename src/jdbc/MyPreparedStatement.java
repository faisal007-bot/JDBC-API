package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class MyPreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName(MyConnection.driverClassname);
			Connection conn = DriverManager.getConnection
					(MyConnection.url,MyConnection.username,MyConnection.password);
			
//			preparedStatement is used to perform dynamic queries
//			using the prepareStatement method of the connection to get the object of the 
//			preparedstatement 
//			PreparedStatement psmt = conn.prepareStatement("insert into student values(?,?,?)");
			
//			performing database operations using the preparedstatement object
			
//			inserting the student
//			PreparedStatement psmt = conn.prepareStatement("insert into student values(?,?,?)");
			
//			passing dynamic values in the query
//			first parameter represents the position inside the query of preparedStatement
//			second parameter represents the value which will be inserted inside the row
			
//			setInt method is used to set the number datatype
//			psmt.setInt(1, 8);
			
//			setString method is used to set the String datatype
//			psmt.setString(2, "nerd");
//			psmt.setString(3, "egypt");
			
//			executeUpdate method of preparedStatement is used for 
//			update,delete and insert operations and it returns int 1--> if successfull
//			int status = psmt.executeUpdate();
//			System.out.println(status+" student inserted");
			
//			updating the student
//			PreparedStatement psmt = conn.prepareStatement
//					("update student set name=? ,city=? where id=?");
//			psmt.setString(1, "faiz khan");
//			psmt.setString(2, "mumbai");
//			psmt.setInt(3, 1);
//			int status = psmt.executeUpdate();
//			System.out.println(status+" student updated");
			
//			deleting the student
//			PreparedStatement psmt = conn.prepareStatement("delete from student where id=?");
//			psmt.setInt(1, 1);
//			int status = psmt.executeUpdate();
//			System.out.println(status+" student deleted");
			
//			fetching single student
//			PreparedStatement psmt = conn.prepareStatement("select * from student where id=?");
//			psmt.setInt(1, 2);
//			ResultSet rs = psmt.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
//			}
			
//			fetching multiple students
//			PreparedStatement psmt = conn.prepareStatement("select * from student");
//			ResultSet rs = psmt.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
//			}
			
			
//			executing batchprocessing using preparedstatement 
//			addbatch and executeBatch method of preparedStatement is used to perform batch 
//			processing
//			PreparedStatement psmt = 
//					conn.prepareStatement("insert into student values(?,?,?)");
//			psmt.setInt(1, 14);
//			psmt.setString(2, "tesla");
//			psmt.setString(3, "germany");
//			psmt.addBatch();
			
//			for adding other batches we need to pass the values directly inside the query 
//			instead of passing dynamic values bcoz it will throw an exception
//			psmt.addBatch("update student set name='thomas',city='texas' where id=5");
//			psmt.executeBatch();
//			System.out.println("batch processing completed");
								
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
