package TestProject.TestProject;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String :");
		String s1 = sc.nextLine();

		String s2 = ReverseStatement(s1);

		System.out.println("Input: " + s1);
		System.out.println("Output: " + s2);

		sc.close();

	}
	
	public static String ReverseStatement(String s1) {
		// TODO Auto-generated method stub

		String[] input = s1.split(" ");

		String output = " ";

		for (int i = input.length - 1; i >= 0; i--) {
			output = output + input[i] + " ";
		}

		return output;
	}


}
