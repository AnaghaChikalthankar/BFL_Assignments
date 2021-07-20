package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeCar {
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException  {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("CarData2")));
		Car car = (Car)ois.readObject();
		ois.close();
		System.out.println("Registration No. : "+car.getRegistrationNo()+"\nCar Make : "+car.getCarMake()+"\nEngine No. : "+car.getEngine().getEngineNo()+"\nEngine Cubic Capacity : "+car.getEngine().getCubicCapacity());
		
	}

}
