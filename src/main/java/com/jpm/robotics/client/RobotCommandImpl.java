package com.jpm.robotics.client;

import java.util.logging.Logger;

import org.springframework.web.client.RestTemplate;

public class RobotCommandImpl implements RobotCommand {
	
	public RobotStateRes getCurrentState() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands",
				RobotStateRes.class);
		return robotState;
	}

	public RobotStateRes informReachedLocker() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=reachedLocker",
				RobotStateRes.class);
		return robotState;
	}

	public RobotStateRes informReachedDesk() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=reachedDesk",
				RobotStateRes.class);
		return robotState;
	}

	public RobotStateRes informPackageDelivered() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=packageDelivered",
				RobotStateRes.class);
		return robotState;
	}

	public RobotStateRes informLockerOpened() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/commands?updateState=lockerOpened",
				RobotStateRes.class);
		return robotState;
	}

	public RobotStateRes resetState() {
		RestTemplate restTemplate = new RestTemplate();
		RobotStateRes robotState = restTemplate.getForObject("https://robot-server-v1.herokuapp.com/reset",
				RobotStateRes.class);
		return robotState;
	}

}
