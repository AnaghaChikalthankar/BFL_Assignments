package Assignment2;
import java.util.Scanner;
public class TestCustomer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer number");		
		String custNo = scan.nextLine();
		
		System.out.println("Enter Customer name");		
		String custName = scan.nextLine();
		
		System.out.println("Enter Customer category");
		String category = scan.nextLine();
		
		char first = custNo.charAt(0);
		Customer c = new Customer(custNo,custName,category);

		try {
			if(first =='C' || first =='c') 
				try {
					if(custName.length()>=4)
						try {
							if(category.equals("Gold") ||category.equals("Platinum")||category.equals("Silver")) 
								c.get();
							else
								throw new InvalidInputException();
							}
						catch(InvalidInputException e) {
							System.out.println(e.getMessage());
						}
					else
						throw new InvalidInputException();}
				catch(InvalidInputException e) {
					System.out.println(e.getMessage());
				}			
			else
				throw new InvalidInputException();
		}catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}

	}}
