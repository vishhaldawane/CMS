import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
//		0. KNOW YOUR DATABASE  AND THE DRIVER
//			oracle / mysql
		
    //    1. LOAD THE DRIVER
    
	//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	
		try {
			System.out.println("Trying to load the database driver...");
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Database driver loaded...");
			
		    //     2. GET THE CONNECTION
			System.out.println("Trying to connect to the database...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=root123");
				
			System.out.println("Connected to the DB : "+conn);
			
		    //   3. MAKE A DESIRED STATEMENT
			Statement statement1 = conn.createStatement();
			Statement statement2 = conn.createStatement();
			Statement statement3 = conn.createStatement();

		    //    4. EXECUTE THE STATEMENT
			ResultSet result1 = statement1.executeQuery("SELECT * FROM dept ");
			ResultSet result2 = statement2.executeQuery("SELECT * FROM emp ");
			ResultSet result3 = statement3.executeQuery("select dname,ename,name from dept d, emp e, customer c where d.deptno=e.deptno and e.empno = c.repid");

		    //    5. ACQUIRE THE RESULT IF ANY 
			while(result1.next()) {
				System.out.println("dno    : "+result1.getInt(1));
				System.out.println("dname  : "+result1.getString(2));
				System.out.println("loc     : "+result1.getString(3));
				System.out.println("------------------");
			}

			System.out.println("************************");

		    //    5. ACQUIRE THE RESULT IF ANY 
					while(result2.next()) {
						System.out.println("eno    : "+result2.getInt(1));
						System.out.println("ename  : "+result2.getString(2));
						System.out.println("job    : "+result2.getString(3));
						System.out.println("------------------");
					}

					System.out.println("************************");
					
				    //    5. ACQUIRE THE RESULT IF ANY 
					while(result3.next()) {
						System.out.println("DNAME    : "+result3.getString(1));
						System.out.println("ENAME    : "+result3.getString(2));
						System.out.println("CNAME    : "+result3.getString(3));
						System.out.println("------------------");
					}

			
		    //    6. CLOSE THE RESULT, STATEMENT, CONNECTION
					result3.close();
					result2.close();
					result1.close();
			
			statement3.close();
			statement2.close();
			statement1.close();

			conn.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END of MAIN");
	}
}
