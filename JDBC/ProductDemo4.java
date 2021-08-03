
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "123");
		Statement statement = connection.createStatement();


		
		String query = "update products set prod_price = prod_price*1.1 where prod_catg = 'Electronics' and prod_price<1000";
		int status = statement.executeUpdate(query);
		
		String query1 = "update products set prod_price = prod_price*0.9 where prod_catg = 'Clothing' and prod_price>1000";
		int status1 = statement.executeUpdate(query1);
		
    	System.out.println(status);	
    	System.out.println(status1);	
		connection.close();
}
	}
