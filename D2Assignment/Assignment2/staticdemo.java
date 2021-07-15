package com.manipal.demo;

public class staticdemo {
	private static double temp;
	private static int a;
	private static int b;
	public staticdemo(double temp, int a, int b) {
		super();
		this.temp = temp;
		this.a = a;
		this.b = b;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	static void  fahrenheitToCelcius() {
		double c = (temp-32)/1.8;
		System.out.println("Temperature in celcius is: "+c);
	}
	static void max() {
		if(a>b) {System.out.println("Greater no is:"+a);}
		else{System.out.println("Greater no is:"+b);}
	}
	

}
