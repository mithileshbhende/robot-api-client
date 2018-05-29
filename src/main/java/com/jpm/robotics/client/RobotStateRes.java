package com.jpm.robotics.client;

public class RobotStateRes {

	private String atBase;
	private String proceedToLocker;
	private String lockerOpened;
	private String reachedLocker;
	private String proceedToDesk;
	private String reachedDesk;
	private String packageDelivered;
	private String user;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAtBase() {
		return atBase;
	}
	public void setAtBase(String atBase) {
		this.atBase = atBase;
	}
	public String getProceedToLocker() {
		return proceedToLocker;
	}
	public void setProceedToLocker(String proceedToLocker) {
		this.proceedToLocker = proceedToLocker;
	}
	public String getLockerOpened() {
		return lockerOpened;
	}
	public void setLockerOpened(String lockerOpened) {
		this.lockerOpened = lockerOpened;
	}
	public String getReachedLocker() {
		return reachedLocker;
	}
	public void setReachedLocker(String reachedLocker) {
		this.reachedLocker = reachedLocker;
	}
	public String getProceedToDesk() {
		return proceedToDesk;
	}
	public void setProceedToDesk(String proceedToDesk) {
		this.proceedToDesk = proceedToDesk;
	}
	public String getReachedDesk() {
		return reachedDesk;
	}
	public void setReachedDesk(String reachedDesk) {
		this.reachedDesk = reachedDesk;
	}
	public String getPackageDelivered() {
		return packageDelivered;
	}
	public void setPackageDelivered(String packageDelivered) {
		this.packageDelivered = packageDelivered;
	}
	
}
