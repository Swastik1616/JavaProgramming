import java.sql.*;

public class Connect {
	public static void main (String args[]){
		Connection conn = null;
		try{
			String username = "root";
			String password = "swastik1616";
			String url = "jdbc:mysql://localhost:3306/college";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Database Connection Established");
		}
		catch(Exception e){
			System.err.println("Cannot connect to Database Server: " +e);
		} finally {
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
	javac -cp mysql.jar;. Connect.java 
		or simply
	javac Connect.java
*/

/* use the following command to run this file: 
	java -cp mysql.jar;. Connect
*/