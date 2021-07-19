package com.shape;
interface polygon{
	void calcArea();
	void calcPeri();
}
public class Square implements polygon {
	float side;
    public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		
		System.out.println("Area of square is : "+ side*side);
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of square is : "+ 4*side);
	}


}