package com.jpm.robotics.client;

import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long timeStart = System.currentTimeMillis();
		System.out.println(new RobotCommandImpl().getCurrentState().toString());
		System.out.println("Total Time : " + (System.currentTimeMillis() - timeStart)/1000);
	}
}
