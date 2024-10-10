import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbb","root","");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into Emp values (?,?)");
		preparedStatement.setInt(1, 25);
		preparedStatement.setString(2, "Jay");
		preparedStatement.executeUpdate();
		System.out.println("Inserted");
		connection.close();
	}
}
