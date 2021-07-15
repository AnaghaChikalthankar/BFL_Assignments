import java.util.Scanner;
public class CircleComputation {
	double r;	
	public CircleComputation(double r){this.r = r;}
	void ComputeArea() {
		System.out.printf("Area of circle is: %.2f",Math.PI*r*r);		
	}
	void ComputeCircumferance() {
		System.out.printf("\nCircumferance of circle is: %.2f",2*Math.PI*r);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = scan.nextDouble();
		
		CircleComputation c = new CircleComputation(r);
			c.ComputeArea();
			c.ComputeCircumferance();
	}
	
}
