package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	if(text1.length()==text2.length()) {
		char[] Array1 = text1.toCharArray();
		char[] Array2 = text2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		Array1.equals(Array2);
		System.out.println("The given string is Anagram");
	}
	else {
		System.out.println("The given string is not Anagram");
	}
}
}
