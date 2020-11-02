import java.util.Scanner;
public class hourminsec55 {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a value of seconds: ");
		int seconds = in.nextInt(); 
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;
        hour = hour / 60;
        
        System.out.print( hour + ":" + min + ":" + sec);
		System.out.print("\n");
		
		in.close();
    }    
 }