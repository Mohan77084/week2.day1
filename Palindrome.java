package week2.day1.assignments;

public class Palindrome {
public static void main(String[] args) {
	String str = "madam";
	String rev = "";
	char[] charArray = str.toCharArray();
	int l= str.length();
	for (int i=l-1; i>=0; i--) {
		rev = rev + charArray[i];
	}
	if(str.equals(rev)) {
		System.out.println("The given string is Palindrome");
	}
	else {
		System.out.println("The given string is not a Palindrome");
	}
	
	
}
}
