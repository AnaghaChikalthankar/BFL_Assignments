
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class main {


	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Ticket t = new Ticket();
		traindata td = new traindata();
		Passenger p = new Passenger();
		Scanner scan = new Scanner(System.in);
		LocalDate lt= LocalDate.now();
		System.out.println("Enter train no.");
		int No = scan.nextInt();		
		td.setTrainNo(No);
		
		if(No != 1001 && No != 1002 && No != 1003 && No != 1004 && No != 1005 && No != 1006) {
			System.out.println("Please enter correct train no.");}
		else {
		td.method();
		
		System.out.println("Enter date");
		String n = scan.next();
		LocalDate today = LocalDate.parse(n);	
		t.setY(today.getYear());
		t.setM(today.getMonthValue());
		t.setD(today.getDayOfMonth());
		t.setNum(No);
		
		if(today.getDayOfMonth()<=lt.getDayOfMonth() &&  today.getMonthValue()<=lt.getMonthValue() && today.getYear()<=lt.getYear())
		{System.out.println("Please enter date after todays date");}
		else {
		System.out.println("Enter No. of passengers");
		int N = scan.nextInt();
		
		for(int i =0;i<N;i++) {
			System.out.println("Enter Name of passenger "+(i+1));
			String name = scan.next();
			p.setName(name);
			t.setPnam(name);
		
			
			System.out.println("Enter age of passenger "+(i+1));
			int age = scan.nextInt();
		    p.setAge(age);
		    t.setPage(age);
			
			System.out.println("Enter gender of passenger "+(i+1));
			char g = scan.next().charAt(0);
			p.setGender(g);
			t.setPgen(g);
			
			t.addPassenger(p.getName(), p.getAge(), p.getGender());
			}
		
		t.getTicket();
		System.out.println(t.generateTicket());
		

		
		}
		}
		
		}	
		
	}


