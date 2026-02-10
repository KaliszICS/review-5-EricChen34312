import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);
		
		//get value
		System.out.print("Input a number: ");
		double x = sc.nextDouble();
		sc.nextLine();

		//print abs of x
		System.out.println(Math.abs(x));
	}

	public static void q2() {
		//Write question 2 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a number: ");
		double x = sc.nextDouble();

		System.out.print("Input another number: ");
		double y = sc.nextDouble();
		sc.nextLine();

		//print floor & ceil of x/y
		System.out.println(Math.floor(x/y));
		System.out.println(Math.ceil(x/y));
	}

	public static void q3() {
		//Write question 3 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);
		
		//get value
		System.out.print("Input a number: ");
		double x = sc.nextDouble();
		sc.nextLine();

		//print sqrt rnded of x
		System.out.println(Math.round(Math.sqrt(x)));
		
	}

	public static void q4() {
		//Write question 4 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a number: ");
		double x = sc.nextDouble();

		System.out.print("Input another number: ");
		double y = sc.nextDouble();
		sc.nextLine();

		//print x**y
		System.out.println(Math.pow(x,y));
	}

	public static void q5() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a number: ");
		double x = sc.nextDouble();

		System.out.print("Input another number: ");
		double y = sc.nextDouble();

		System.out.print("Input one more number: ");
		double z = sc.nextDouble();
		sc.nextLine();

		//print max and min of the numbers
		System.out.println(Math.max(x,Math.max(y,z)));
		System.out.println(Math.min(x,Math.min(y,z)));
	}
	public static void q6() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a sentence: ");
		String str = sc.nextLine();

		//print if "on" in str
		System.out.println(str.contains("on"));
		
	}
	public static void q7() {
		//Write question 5 code here
		//Initiate Scanner
		Scanner sc = new Scanner(System.in);

		//get value
		System.out.print("Input the word mango: ");
		String str = sc.nextLine();

		//print equalsignorecase str
		System.out.println(str.equalsIgnoreCase("mango"));
	}
	public static void q8() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a word: ");
		String str = sc.nextLine();

		System.out.print("Input a letter: ");
		char c = sc.nextLine().charAt(0);
		
		//print indicies of the letter
		System.out.println(str.indexOf(c));
		System.out.println(str.lastIndexOf(c));		
	}

	public static void q9() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a sentence: ");
		String str = sc.nextLine();

		//print thing
		System.out.println("Your sentence is " + str.length() + " characters long");
	}
	public static void q10() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a sentence: ");
		String str = sc.nextLine();

		System.out.print("Input a word to replace: ");
		String strReplace = sc.nextLine();

		System.out.print("What word would you like to replace it with: ");
		String strNew = sc.nextLine();

		//print string with replacements
		System.out.println(str.replaceAll(strReplace,strNew));
	}

	public static void q11() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a sentence: ");
		String str = sc.nextLine();

		//print strings
		System.out.println(str.toUpperCase().trim());
		System.out.println(str.toLowerCase().trim());
		
	}

	public static void q12() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get values
		System.out.print("Input a word: ");
		String str = sc.nextLine();

		//print substrings
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(str.length()-4));
		
	}
	

}
