package questionsss;
import java.util.*;

interface TrafficControl{
	void activate();
	void deactivate();
	void getStatus();
	void adaptiveControl();
}

abstract class TrafficDevice implements TrafficControl{
	String deviceId;
	String location;
	String status;
	String lastUpdated;
	
	TrafficDevice(String deviceId,String location,String status,String lastUpdated){
		this.deviceId=deviceId;
		this.location=location;
		this.status=status;
		this.lastUpdated=lastUpdated;
	}
	
	public void activate() {
		System.out.println("Activating " + deviceId);
	}
	
	public void deactivate() {
		System.out.println("Deactivating " + deviceId);
	}
	
	public void getStatus() {
		System.out.println("Status of " + deviceId + " is " + status);
	}
}

class TrafficSignal extends TrafficDevice{
	TrafficSignal(String id,String loc,String status,String time){
        super(id,loc,status,time);
    }

    public void adaptiveControl() {
        System.out.println("Heavy congestion detected. Extending green signal duration.");
    }
}

public class TrafficManagementSystem {

	public static void main(String[] args) {
		

	}

}
