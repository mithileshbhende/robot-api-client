package com.jpm.robotics.client;

import java.util.logging.Logger;

import org.springframework.web.client.RestTemplate;

public class RobotCommandImpl implements RobotCommand {
	
	public RobotStateRes getCurrentState() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

	public RobotStateRes informReachedLocker() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=reachedLocker",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

	public RobotStateRes informReachedDesk() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=reachedDesk",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

	public RobotStateRes informPackageDelivered() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=packageDelivered",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

	public RobotStateRes informLockerOpened() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=lockerOpened",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

	public RobotStateRes resetState() {
		long timeStart = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/reset",
				RobotStateRes.class);
		System.out.println(robotState.toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
		return robotState;
	}

}
