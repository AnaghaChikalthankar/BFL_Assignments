

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class traindata {
	
	static int trainNo;
	static String trainName;
	static String source;
	static String destination;
	static Double ticketPrice;
public static int getTrainNo() {
		return trainNo;
	}


	public static void setTrainNo(int trainNo) {
		traindata.trainNo = trainNo;
	}

	public static String getTrainName() {
		return trainName;
	}

	public static void setTrainName(String trainName) {
		traindata.trainName = trainName;
	}
public static String getSource() {
		return source;
	}
public static void setSource(String source) {
		traindata.source = source;
	}
	public static String getDestination() {
		return destination;
	}
public static void setDestination(String destination) {
		traindata.destination = destination;
	}
	public static Double getTicketPrice() {
		return ticketPrice;
	}

	public static void setTicketPrice(Double ticketPrice) {
		traindata.ticketPrice = ticketPrice;
	}
	

	

  public void method() throws ClassNotFoundException, SQLException {
    	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "123");
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("SELECT * FROM TRAINS WHERE TRAIN_NO = "+trainNo);
	
	
	 while(resultSet.next()) {
		 trainNo = resultSet.getInt(1);
		 trainName = resultSet.getString(2);
		 source = resultSet.getString(3);
		 destination = resultSet.getString(4);
		 ticketPrice = resultSet.getDouble(5);}
	 
	 connection.close();
	     //return (trainNo + "\t"+ trainName+ "\t"+source+ "\t"+destination+ "\t"+ticketPrice);
	
	     
	     //System.out.println("Train No. : "+trainNo );
}}
