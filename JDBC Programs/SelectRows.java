import java.sql.*;

public class SelectRows {
	public static void main (String args[]){
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rs = null;
		//String TableName;
		try{
			String username = "root";
			String password = "nahibatauga";
			String url = "jdbc:mysql://localhost:3306/college";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Database Connection Established");
			//selcting rows from the table
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * From student;");
			while(rs.next()){
				int c1 = rs.getInt("Roll_Number");
				String c2 = rs.getString("Name");
				String c3 = rs.getString("Grade");
				String c4 = rs.getString("Contact");
				int c5 = rs.getInt("Marks");
				System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
			}
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
	javac -cp mysql.jar;. SelectRows.java 
		or simply
	javac SelectRows.java
*/

/* use the following command to run this file: 
	java -cp mysql.jar;. SelectRows
*/