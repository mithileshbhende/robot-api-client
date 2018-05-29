import com.jpm.robotics.client.RobotCommandImpl;
import com.jpm.robotics.client.RobotStateRes;

public class ClientClass {
	
	
	public static void main(String ag[]){
		
		RobotStateRes response = new RobotCommandImpl().getCurrentState();
		System.out.println(response.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

		RobotStateRes responseAfterInformReachedLocker = new RobotCommandImpl().informReachedLocker();
		System.out.println(responseAfterInformReachedLocker.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

		RobotStateRes responseAfterInformLockerOpened = new RobotCommandImpl().informLockerOpened();
		System.out.println(responseAfterInformLockerOpened.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

		RobotStateRes responseAfterInformReachedDesk = new RobotCommandImpl().informReachedDesk();
		System.out.println(responseAfterInformReachedDesk.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

		RobotStateRes responseAfterInformPackageDelivered = new RobotCommandImpl().informPackageDelivered();
		System.out.println(responseAfterInformPackageDelivered.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

		RobotStateRes responseAfterResetState = new RobotCommandImpl().resetState();
		System.out.println(responseAfterResetState.toString());
		System.out.println("---------------------------------------------------------------------------------------------");

	}
}


https://robot-server-v1.herokuapp.com/commands?updateState=start&user=XXXX2
https://robot-server-v1.herokuapp.com/commands?updateState=reachedLocker
https://robot-server-v1.herokuapp.com/commands?updateState=lockerOpened
https://robot-server-v1.herokuapp.com/commands?updateState=reachedDesk
https://robot-server-v1.herokuapp.com/commands?updateState=packageDelivered
https://robot-server-v1.herokuapp.com/reset
https://robot-server-v1.herokuapp.com/commands


Class RobotStateRes{

    private String atBase; // Values Y/N; default Value Y
    private String proceedToLocker; // Values Y/N; default Value Y
    private String lockerOpened; // Values Y/N; default Value Y
    private String reachedLocker; // Values Y/N; default Value Y
    private String proceedToDesk; // Values Y/N; default Value Y
    private String reachedDesk; // Values Y/N; default Value Y
    private String packageDelivered; // Values Y/N; default Value Y
    private String user; // Values 0, 1, 2 ; default Value 0, Value calculated from the last digit of the SID. Works only for last digit 1 or 2 
}
