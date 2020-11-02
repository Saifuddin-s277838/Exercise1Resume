import java.util.Scanner;
public class hexagon34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    double length, area;
	    double pi = Math.PI;
	        
	    System.out.print("Please enter the length of the side of the hexagon: ");
	    length = in.nextDouble();
	        
	    area = (6*(length*length))/(4*Math.tan(pi/6));
	    System.out.print("The area of the hexagon is: " + area);
	    
	    in.close();

	}
}
