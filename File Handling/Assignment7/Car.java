package File_Handling;

import java.io.Serializable;

public class Car implements Serializable {
	private String registrationNo;
	private String carMake;
	private Engine engine;
	public Car() {}
	
	public Car(String registrationNo, String carMake, Engine engine) {
		super();
		this.registrationNo = registrationNo;
		this.carMake = carMake;
		this.engine = engine;
	}
	
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	 @Override
	    public String toString() {
	        return String.format("Car {Registration number='%s', carmake='%s', Engine info='%s'}", 
	        		registrationNo, carMake, engine);
	    }
	
	

}
