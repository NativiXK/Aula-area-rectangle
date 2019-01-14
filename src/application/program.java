package application;

import java.util.Locale;
import java.util.Scanner;

import shapes.rectangle;

public class program {

	public static void main(String[] args) {
		
		rectangle Rectangle = new rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle.width = sc.nextDouble();
		Rectangle.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", Rectangle.Area());
		System.out.printf("Area = %.2f%n", Rectangle.Perimeter());
		System.out.printf("Area = %.2f%n", Rectangle.Diagonal());
		
		sc.close();
	}

}
