import java.util.Scanner;
public class arithmetic6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Please enter first number: ");
		num1 = in.nextDouble();
		System.out.print("Please enter second number: ");
		num2 = in.nextDouble();
		
		double sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		double minus = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + minus);
		double multiply = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + multiply);
		double divide = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divide);
		double remainder = num1 % num2;
		System.out.print(num1 + " % " + num2 + " = " + remainder);
		
		in.close();
		

	}

}
