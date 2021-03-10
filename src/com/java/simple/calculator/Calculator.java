package com.java.simple.calculator;

import java.util.Scanner;

/*
 * Author:- Tirtha Sharma
 * Position:- Full Stack Software Developer
 * JDK Version:-1.8
 */

public class Calculator {

	public static void main(String[] args) {

		// Creating the object of SimpleCalci

		SimpleCalci calculator = new SimpleCalci("Calculator", "c0001");
		calculator.showCalculator();

	}

}

class SimpleCalci {

	String user;
	String userID;
	int total_;

	public SimpleCalci(String user, String userID) {
		this.user = user;
		this.userID = userID;
	}

	// Addition Operation
	public void add(int num1, int num2) {

		if (num1 > 0 && num2 > 0) {
			total_ = num1 + num2;
			System.out.println("Adding Operation " + " = " + total_);
		} else if (num1 == 0 && num2 == 0) {
			System.out.println("Enter num1 and num2 greater than 0");
		} else {
			System.out.println("Wrong information provided!!!");
		}

	}

	// Subtraction Operation
	public void subtract(int num1, int num2) {

		if (num1 > 0 && num2 > 0) {
			total_ = num1 - num2;
			System.out.println("Subtraction Operation:- " + " = " + total_);
		} else if (num1 == 0 && num2 == 0) {
			System.out.println("Enter num1 and num2 greater than 0");
		} else {
			System.out.println("Wrong information provided!!!");
		}

	}

	// Multiplication Operation
	public void multiply(int num1, int num2) {

		if (num1 > 0 && num2 > 0) {
			total_ = num1 * num2;
			System.out.println("Multiplication Operation:- " + " = " + total_);
		} else if (num1 == 0 && num2 == 0) {
			System.out.println("Enter num1 and num2 greater than 0");
		} else {
			System.out.println("Wrong information provided!!!");
		}
	}

	// Divivsion Operation
	public void divide(int num1, int num2) {

		if (num1 > 0 && num2 > 0) {
			total_ = num1 / num2;
			System.out.println("Divide Operations:- " + " = " + total_);
		} else if (num1 == 0 && num2 == 0) {
			System.out.println("Enter num1 and num2 greater than 0");
		} else {
			System.out.println("Wrong information provided!!!");
		}
	}

	// Modulus Operation
	public void modulus(int num1, int num2) {

		if (num1 > 0 && num2 > 0) {
			total_ = num1 % num2;
			System.out.println("Modulus(%) Operation:- " + " = " + total_);
		} else if (num1 == 0 && num2 == 0) {
			System.out.println("Enter num1 and num2 greater than 0");
		} else {
			System.out.println("Wrong Information Provided!!!");
		}
	}

	// Square Operation
	public void square(int square1, int square2) {
		if (square1 > 0 && square2 > 0) {
			total_ = (int) Math.pow(square1, square2);
			System.out.println("Squaring(^) Operations:- " + total_);
		} else if (square1 == 0 || square2 == 0) {
			System.out.println("Enter square greater than 0");
		} else {
			System.out.println("Wrong Information Provided!!!");
		}
	}

	public void showCalculator() {

		char options = '\0';
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome:- " + user);
		System.out.println("Your ID is:- " + userID);
		System.out.println("You can perform the calculator operations.......");
		System.out.println("\n");

		System.out.println("A. ADD(+)");
		System.out.println("B. SUBTRACT(-)");
		System.out.println("C. MULTIPLY(*)");
		System.out.println("D. DIVISION(/)");
		System.out.println("E. MODULUS(%)");
		System.out.println("F. SQUARE(^)");
		System.out.println("G. EXIT");

		do {
			System.out.println("===================================================");
			System.out.println("Enter the options according to your choice:-");
			options = scan.next().charAt(0);
			System.out.println("===================================================");

			switch (options) {

			case 'A':
				System.out.println("====================================");
				System.out.println("Enter the two numbers:-");
				int add1 = scan.nextInt();
				int add2 = scan.nextInt();
				add(add1, add2);
				System.out.println("====================================");
				break;

			case 'B':
				System.out.println("====================================");
				System.out.println("Enter the two numbers:-");
				int sub1 = scan.nextInt();
				int sub2 = scan.nextInt();
				subtract(sub1, sub2);
				System.out.println("====================================");
				break;

			case 'C':
				System.out.println("====================================");
				System.out.println("Enter the two numbers:-");
				int mul1 = scan.nextInt();
				int mul2 = scan.nextInt();
				multiply(mul1, mul2);
				System.out.println("====================================");
				break;

			case 'D':
				System.out.println("====================================");
				System.out.println("Enter the two numbers:-");
				int div1 = scan.nextInt();
				int div2 = scan.nextInt();
				divide(div1, div2);
				System.out.println("====================================");
				break;

			case 'E':
				System.out.println("====================================");
				System.out.println("Enter the two numbers:-");
				int mod1 = scan.nextInt();
				int mod2 = scan.nextInt();
				modulus(mod1, mod2);
				System.out.println("====================================");
				break;

			case 'F':
				System.out.println("====================================");
				System.out.println("Enter the number for squaring:-");
				int sq1 = scan.nextInt();
				int sq2 = scan.nextInt();
				square(sq1, sq2);
				System.out.println("====================================");
				break;

			case 'G':
				System.out.println("End of the Calculator Operation!!!");
				break;

			default:
				System.out.println("Invalid option Performed.Please try again!!!");
				break;
			}

		} while (options != 'G');

	}
}

