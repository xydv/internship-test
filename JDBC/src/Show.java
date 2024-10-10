import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Show {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbb", "root", "");
		ResultSet resultset = connection.prepareStatement("select * from Emp").executeQuery();
		while (resultset.next()) {
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
		}
		connection.close();
	}
}
