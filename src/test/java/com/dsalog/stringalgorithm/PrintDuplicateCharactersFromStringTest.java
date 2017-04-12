package com.dsalog.stringalgorithm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class PrintDuplicateCharactersFromStringTest {

	@Test()
	public void testNullString() throws Exception {
		try {
			PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString(null);
			fail("Wrong Input");
		} catch (Exception e) {
		}
	}
	
	@Test()
	public void testEmptyString() throws Exception {
			assertTrue("Empty String:", "".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("")));
	}

	@Test()
	public void testStringWithDuplicateCharacters() throws Exception {
			assertTrue("Found duplicate char(s):", "a".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("java")));
	}

	@Test()
	public void testStringWithDuplicateCharactersRepeatable() throws Exception {
		System.out.println(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("saataattffaaffst"));
			assertTrue("Found duplicate char(s):", "afst".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("saataattffaaffst")));
	}
	
	@Test()
	public void testStringNoDuplicateCharacters() throws Exception {
			assertTrue("No duplicate char:", "".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("angle")));
	}
	
	@Test()
	public void testStringWithSpaces() throws Exception {
			assertTrue("No duplicate char:", "".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("ang le")));
			assertTrue("Found duplicate char(s):", "afst".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("saataattffaaffst")));
			assertTrue("No duplicate char:", "".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString(" angle")));
			assertTrue("No duplicate char:", "".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("angle  ")));
			assertTrue("Found duplicate char(s):", "a".equalsIgnoreCase(PrintDuplicateCharactersFromString.getDuplicateCharsFromCaseInSensitiveString("  java")));
	}
}
