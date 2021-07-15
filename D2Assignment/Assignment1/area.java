//area of a circle, triangle, rectangle and a cylinder
public class area {
	private double radius;
	private double height,base;
	private double length,breadth;
	private double height1,radius1;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getHeight1() {
		return height1;
	}
	public void setHeight1(double height1) {
		this.height1 = height1;
	}
	public double getRadius1() {
		return radius1;
	}
	public void setRadius1(double radius1) {
		this.radius1 = radius1;
	}
//circle, triangle, rectangle and a cylinder	
	public void areaofcircle() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle is:"+area);		
	}
	public void areaoftriangle() {
		double area = 0.5*base*height;
		System.out.printf("Area of triangle is:"+area);		
	}
	public void areaofrectangle() {
		double area = length*breadth;
		System.out.println("Area of rectangle is:"+area);		
	}
	public void areaofcylinder() {
		double area = Math.PI*radius1*radius1*height1;
		System.out.println("Area of cylinder is:"+area);		
	}

}
