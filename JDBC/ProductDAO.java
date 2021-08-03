import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Enter the no. of products you want to insert");
		Scanner scan = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "123");

		String query = "insert into products values(?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		
		
		int n = scan.nextInt();
		ArrayList<Product> p = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			
			System.out.println("Enter code");
			int code = scan.nextInt();
			
			System.out.println("Enter name");
			String Name = (scan.next());
			
			System.out.println("Enter price");
			int Price = (scan.nextInt());
			
			System.out.println("Enter catg");
			String Catg = (scan.next());
			
			Product pro = new Product(code,Name,Price,Catg);
			
			p.add(pro);
			
			preparedStatement.setInt(1, code);
			preparedStatement.setString(2, Name);
			preparedStatement.setInt(3, Price);
			preparedStatement.setString(4, Catg);
			
			int status = preparedStatement.executeUpdate();
			//System.out.println(status);
	}
				
		Iterator<Product> iterator = p.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("All inputs inserted successfully");
		
		connection.close();
		
	}

}
