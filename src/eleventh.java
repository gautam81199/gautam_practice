/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/

import java.util.Scanner;

public class eleventh {
	//private static final double radius=7.5;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input your radius");
		float radius = sc.nextFloat();
		double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
	}

}
