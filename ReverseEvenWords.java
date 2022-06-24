package week2.day1.assignments;

public class ReverseEvenWords {
public static void main(String[] args) {
	String text = "I am a software tester";
	String[] split = text.split(" ");
		String output = "";
	for (int i =0;i<split.length;i++) {
		if(i%2 != 0) {
			char[] charArray = split[i].toCharArray();
			String rev = "";
			for(int j=charArray.length - 1; j>=0; j--) {
			rev += charArray[j];
			}
			output+= rev+" ";
		} 
		else {
			output+= split[i]+" ";
		}
	}
	System.out.println(output);
}
}