import java.util.Scanner;
public class Exercise2TenQuestions{

	public static void main(String[] args) {
		
		printhelloName1();
		printarithmetic6();
		printaverage12();
		printcircle11();
		printrectangle13();
		printhexagon34();
		printhourminsec55();
		printinteger_n44();
		printmultiplytable7();
		printpattern8();
		
	}
	
	public static void printhelloName1(){
	
		System.out.println("Hello");
		System.out.println("Ahmad Saifuddin bin Ilias");
		
	}
	
	public static void  printarithmetic6() {
	
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
		System.out.println(num1 + " % " + num2 + " = " + remainder);
		
	}
	
	public static void printaverage12(){
		
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
		
		System.out.println("The average for the three numbers is " + avg);
		
	}
	
	public static void printcircle11(){
		
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
				
		System.out.print("Please enter radius of a circle: ");
		double radius = sc.nextDouble();
				
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;
				
		System.out.println("Perimeter is " + perimeter);
		System.out.println("Area is " + area);
		
	}
	
	public static void printrectangle13(){
		
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
			
	}
	
	public static void printhexagon34() {
		
		Scanner in = new Scanner(System.in);
	    double length, area;
	    double pi = Math.PI;
	        
	    System.out.print("Please enter the length of the side of the hexagon: ");
	    length = in.nextDouble();
	        
	    area = (6*(length*length))/(4*Math.tan(pi/6));
	    System.out.println("The area of the hexagon is: " + area);
		
	}
	
	public static void printhourminsec55(){
		
		Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a value of seconds: ");
		int seconds = in.nextInt(); 
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;
        hour = hour / 60;
        
        System.out.print( hour + ":" + min + ":" + sec);
		System.out.print("\n");
		
		
	}
	
	public static void printinteger_n44(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num = sc.nextInt();
		System.out.println(num + " + " + num + "" + num + " + " + num + "" + num + "" + num );
		
	}
	
	public static void printmultiplytable7(){
		
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
		System.out.println(num + " x 10 = " + mult10 );
	}
	
	public static void printpattern8(){
		
		System.out.println("\s\s\sJ\ta\s\s\sv\t\s\sv\s\s\s\sa");
		System.out.println("\s\s\sJ\s\s\sa\sa\s\s\sv\t\sv\s\s\s\sa\sa");
		System.out.println("J\s\sJ\s\saaaaa\s\s\sV\sV\s\s\s\saaaaa");
		System.out.println("\sJJ\s\sa\s\s\s\s\sa\s\s\sV\s\s\s\sa\s\s\s\s\sa");
		
	}

}