//get product code from user
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code");
		int prod_cod = scan.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "123");		
		Statement statement = connection.createStatement();
				
		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS WHERE PROD_CODE = "+prod_cod);
		while(resultSet.next()) {
		int userId = resultSet.getInt(1);
		String name = resultSet.getString(2);
		String price = resultSet.getString(3);
		String catg = resultSet.getString(4);
		System.out.println(userId + "-"+ name+ "-"+price+ "-"+catg);
		}
		connection.close();
		

	}

}
