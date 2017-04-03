package com.dsalog.basics;

public class AngleBetweenHourAndMinuteHands {

	public static double getAngleBetweenHourAndMinuteHands(int hour, int minute) throws Exception{
		double angle;
		try {
			if (hour > 12 || hour < 1 || minute > 60 || minute < 0) {
				throw new Exception("Not a valid input");
			}
			angle = Math.abs(30 * hour - 5.5 * minute);
		} catch (Exception e) {
			throw e;
		}
		System.out.println(Math.min(360 - angle, angle));
		return Math.min(360 - angle, angle);
		
		// We should consider the angle between the hands of the clock going counter-clockwise
		//Math.max(360-angle, angle);
	}
}
