/*Write a Java program that has two classes, Employee and WageCalculator. Employee
has the following details about the employee:
Name,
Employee code
Hours worked
Wage per hour
WageCalculator creates instances of the Employee class, gets the details of the
Employee to calculate the wages and prints it to the standard output. Use the constructor of
the Employee class to assign values to the different variables.*/
public class Employee {
	private String Name;
	private int empcode;
	private int hours;
	private int wagephr;
	public Employee(String name, int empcode, int hours, int wagephr) {
		super();
		Name = name;
		this.empcode = empcode;
		this.hours = hours;
		this.wagephr = wagephr;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getWagephr() {
		return wagephr;
	}
	public void setWagephr(int wagephr) {
		this.wagephr = wagephr;
	}
		public void print() {
			System.out.println("Employee Information:\n"+Name+"\n"+empcode+"\n"+hours+"\n"+wagephr);
			System.out.println("Employee wages: "+ hours*wagephr);
		}
}

