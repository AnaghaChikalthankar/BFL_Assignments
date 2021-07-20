package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCar {

	public static void main(String[] args) throws IOException {
		Engine e = new Engine("AC6098IB",700);
		Car car1 = new Car();
		car1.setEngine(e);
		Car car = new Car("3152","mahesh",car1.getEngine());
		
		
		FileOutputStream fos = new FileOutputStream("CarData2");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(car);
		oos.close();
		System.out.println("Done");

	}

}
