import java.util.Scanner;
public class multiplytable7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("Please enter the number: ");
		num = sc.nextDouble();
		
		double mult1 = num * 1;
		double mult2 = num * 2;
		double mult3 = num * 3;
		double mult4 = num * 4;
		double mult5 = num * 5;
		double mult6 = num * 6;
		double mult7 = num * 7;
		double mult8 = num * 8;
		double mult9 = num * 9;
		double mult10 = num * 10;
		
		System.out.println(num + " x 1 = " + mult1 );
		System.out.println(num + " x 2 = " + mult2 );
		System.out.println(num + " x 3 = " + mult3 );
		System.out.println(num + " x 4 = " + mult4 );
		System.out.println(num + " x 5 = " + mult5 );
		System.out.println(num + " x 6 = " + mult6 );
		System.out.println(num + " x 7 = " + mult7 );
		System.out.println(num + " x 8 = " + mult8 );
		System.out.println(num + " x 9 = " + mult9 );
		System.out.print(num + " x 10 = " + mult10 );
		
		sc.close();

	}

}
