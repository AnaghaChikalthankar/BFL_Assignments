package com.test;
import com.shape.Rectangle;
import com.shape.Square;

public class test {

	public static void main(String[] args) {
		Square s = new Square(5);
		Rectangle r = new Rectangle(3,2);
		s.calcArea();
		s.calcPeri();
		r.calcArea();
		r.calcPeri();
		
		
		
	}

}
