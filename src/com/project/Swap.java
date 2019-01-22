package com.project;

public class Swap {

	static void swapMethod(String one, String two) {
		String holder = two;
		two = one;
		one = holder;

		//System.out.println("Inside scope of swap method: One = " + one + ", Two = " + two);

	}

	public static void main(String[] args) {

		String string1 = "One";
		String string2 = "Two";

		swapMethod(string1, string2);

		System.out.println("string1 = " + string1 + ", string2 = " + string2);
		//Java is pass by value, if it was pass by reference then the swap method 
		//would have swapped the values outside the method scope because the references 
		//would be affected.

	}

}
