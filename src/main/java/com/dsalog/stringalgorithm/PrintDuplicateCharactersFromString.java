package com.dsalog.stringalgorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateCharactersFromString {

	public static String getDuplicateCharsFromCaseInSensitiveString(String word) throws Exception {
		
		if (word == null) {throw new Exception("Wrong Input");}
		if (word.isEmpty()) {return "";};
		//return usingThreeForLoops(word);
		return usingOneForLoop(word);
	}
	
	private static String usingOneForLoop(String word) {
		char[] input = word.toCharArray();
		String output = "";
		Set<Character> originalCharSet = new TreeSet<Character>();
		Set<Character> repeatCharSet = new TreeSet<Character>();
		for (char c : input) {
			if (!originalCharSet.add(c)) {
				repeatCharSet.add(c);
			}
		}
		for (Character character : repeatCharSet) { output += character;}
//		System.out.println("["+output+"]");
		return output.trim();
	}

	private static String usingThreeForLoops(String word) {
		HashSet<Character> duplicateChars = new HashSet<Character>();
		String output = "";
		for (int i = 0; i < word.length() ;i++) {
			for (int j=i+1; j < word.length(); j++) {
				if (word.charAt(j) == word.charAt(i)) { duplicateChars.add(word.charAt(i));}
			}
		}
		for (Character character : duplicateChars) { output += character;}
		return output;
	}

}
