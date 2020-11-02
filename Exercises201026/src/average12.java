import java.util.Scanner;
public class average12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1, num2, num3, total, avg;
		System.out.print("Please enter the first number: ");
		num1 = in.nextDouble();
		System.out.print("Please enter the second number: ");
		num2 = in.nextDouble();
		System.out.print("Please enter the third number: ");
		num3 = in.nextDouble();
		
		total = num1 + num2 + num3;
		avg = total / 3;
		
		System.out.print("The average for the three numbers is " + avg);
		
		in.close();

	}

}
