import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class sdz1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Test by ZeroCool ------------");
 
		try {
 
			Class.forName("org.postgresql.Driver");
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("JDBC Driver? ");
			e.printStackTrace();
			return;
 
		}
 
		System.out.println("PostgreSQL JDBC Driver.........OK!");
 
		Connection connection = null;
 
		try {
 
			connection = DriverManager.getConnection(
					"jdbc:postgresql://88.191.120.50:5432/test", "managec",
					"manage");
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed!");
			e.printStackTrace();
			return;
 
		}
 
		if (connection != null) {
			System.out.println("Everything OK !");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}
