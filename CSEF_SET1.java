package lab_eval2;
import java.util.Scanner;
class Vehicle{
	int vno;
	String make;
	int fuelCapacity;
	
	Vehicle(int vno,String make,int fuelCapacity){
		this.vno=vno;
		this.make=make;
		this.fuelCapacity=fuelCapacity;
	}
	public void showSpecs() {
		System.out.println(vno);
		System.out.println(make);
		System.out.println(fuelCapacity);
	}
	public double Range ( int fuelCapacity) {
		return fuelCapacity*5;
	}
	
}

class ElectricCar extends Vehicle{
	int batteryCapacity;
	int chargingTime;
	
	ElectricCar(int vno,String make,int fuelCapacity,int batteryCapacity,int chargingTime){
		super(vno,make,fuelCapacity);
		this.batteryCapacity=batteryCapacity;
		this.chargingTime=chargingTime;
	}
	@Override
	public void showSpecs() {
		System.out.println(vno);
		System.out.println(make);
		System.out.println(batteryCapacity);
		System.out.println(chargingTime);
	}
	@Override
	public double Range (int batteryCapacity ) {
		return batteryCapacity*5;
	}
}

public class CSEF_SET1 {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Recording Vehicle #"+(i+1));
			System.out.print("Enter vno :");
			int vno=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter make :");
			String make=sc.nextLine();
			
			System.out.print("Enter Battery :");
			int Battery=sc.nextInt();
			
			System.out.print("Enter Charging Time :");
			int ChargingTime=sc.nextInt();
			vehicles[i] = new ElectricCar(vno,make,0,Battery,ChargingTime);
			System.out.println("---Traffic Grid Data Log---");
			vehicles[i].showSpecs();
			System.out.println(vehicles[i].Range(Battery));
		}
		
		

	}

}
