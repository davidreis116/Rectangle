package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Rectangle rectangle = new Rectangle ();
		
		System.out.println("Enter with the width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Enter with the height");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("\nThe area of the rectangle is: %f", rectangle.area(rectangle.height, rectangle.width));
		
		System.out.printf("\nThe area of the perimeter is: %f", rectangle.perimeter(rectangle.height, rectangle.width));
		
		
		sc.close();

	}

}
