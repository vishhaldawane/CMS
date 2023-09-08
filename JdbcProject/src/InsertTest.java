import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		

		try {
			System.out.println("Trying to load the database driver...");
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Database driver loaded...");
			
		    //     2. GET THE CONNECTION
			System.out.println("Trying to connect to the database...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=root123");
				
			System.out.println("Connected to the DB : "+conn);
			
		    //   3. MAKE A DESIRED STATEMENT
			PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPT "
					+ "VALUES (?,?,?)");
			
			pst.setInt(1, Integer.parseInt(args[0]));
			pst.setString(2, args[1]);
			pst.setString(3, args[2]);

			int rows = pst.executeUpdate();
			System.out.println("Rows added : "+rows);
			
			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END of MAIN");
	}
}
