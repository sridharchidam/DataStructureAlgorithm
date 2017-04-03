package com.dsalog.basics;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AngleBetweenHourAndMinuteHandsTest {

	@Test
	public void test_InvalidInput() {
		try {
			AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(13, 61);
			fail("Not a valid input");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void test_HoursAndMinutesAngle() throws Exception {
		assertTrue(AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(12, 0) == 0);
		assertTrue(AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(3, 0) == 90);
		assertTrue(AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(5, 24) == 18);
		assertTrue(AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(9, 45) == 22.5);
		assertTrue(AngleBetweenHourAndMinuteHands.getAngleBetweenHourAndMinuteHands(6, 45) == 67.5);
	}
}
