import java.util.Scanner;
public class rectangle13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, width, area, perimeter;
		
		System.out.print("Please enter height of a rectagle: ");
		height = sc.nextDouble();
		System.out.print("Please enter width of a rectagle: ");
		width = sc.nextDouble();
		
		perimeter = height + height + width + width;
		area = height * width;
		
		System.out.println("Area is " + height + " x " + width + " = " + area);
		System.out.println("Perimeter is " + height + " + " + width + " + " + height + " + " + width + " = " + perimeter);

		sc.close();

	}

}
