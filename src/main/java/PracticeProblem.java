/**
 * File: Methods
 * Author: Leo
 * Date Created: Mar 27, 2026
 * Date Last Modified: Mar 27, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sum(5,6));
	}

	//Create your functions here
	public static int sum(int num1, int num2) { 
		int result;
		result = num1 + num2;
		return result;		
	}

	public static int difference(int num1, int num2) { 
		int result;
		result = num1 - num2;
		return result;	
	}

	public static double product(double num1, double num2) { 
		double result;
		result = num1 * num2;
		return result;	
	}

	public static String removeFirst(String word) { 
		String result;
		result = word.substring(1);
		return result;	
	}

}
