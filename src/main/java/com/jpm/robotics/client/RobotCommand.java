/**
 * 
 */
package com.jpm.robotics.client;

/**
 * @author mithi
 *
 */
public interface RobotCommand {

	public RobotStateRes getCurrentState();
	public RobotStateRes informReachedLocker();
	public RobotStateRes informReachedDesk();
	public RobotStateRes informPackageDelivered();
	public RobotStateRes informLockerOpened();
	public RobotStateRes resetState();

	
}
