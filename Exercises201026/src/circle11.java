import java.util.Scanner;
public class circle11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		
		System.out.print("Please enter radius of a circle: ");
		double radius = sc.nextDouble();
		
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;
		
		System.out.println("Perimeter is " + perimeter);
		System.out.print("Area is " + area);
		
		sc.close();

	}

}
