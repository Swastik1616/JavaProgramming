import java.sql.*;

public class CreateTable {
	public static void main (String args[]){
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rs = null;
		//String TableName;
		try{
			String username = "root";
			String password = "swastik1616";
			String url = "jdbc:mysql://localhost:3306/college";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Database Connection Established");
			
			//creating the table
			stmt = conn.createStatement();
			stmt.execute("Create table teacher(ID INT PRIMARY KEY, Name VARCHAR(100), Subject VARCHAR(50))");
		}
		catch(SQLException ex){
			System.out.println("SQLException: "+ex.getMessage());
			System.out.println("SQLState: " +ex.getSQLState());
			System.out.println("VendorError: "+ex.getErrorCode());
		} 
		catch(Exception e){
			System.err.println("Cannot connect to the Database server");
		}
		finally {
			if (stmt!=null){
				try{
					stmt.close();
				} catch(SQLException sqlEx) { /* ignore code for this */ }
				stmt = null;
			}
			if (conn!=null){
				try{
					conn.close();
					System.out.println("Database Connection Terminated");
				} catch(Exception e) { /* ignore close errors */ }
			}
		}
	}
}



/* use the following command to compile this file: 
	javac -cp mysql.jar;. CreateTable.java 
		or simply
	javac CreateTable.java
*/

/* use the following command to run this file: 
	java -cp mysql.jar;. CreateTable
*/