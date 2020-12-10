
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		System.out.println("For-loop");
		int sum = 0;
		double average ;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum = number + sum;
		}
		
		average = sum / 100 ;
		
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		
		System.out.println("While-do loop");
		
		int sumwhile = 0 ;
		double averagewhile ;
		int lowerboundwhile = 1;
		int upperboundwhile = 100;
		while (lowerboundwhile <= upperboundwhile ){
			sumwhile = lowerboundwhile + sumwhile;
			lowerboundwhile = lowerboundwhile + 1;
		}
		
		averagewhile = sumwhile /100 ;
		
		System.out.println("The sum of 1 to 100 is " +sumwhile);
		System.out.println("The average is " +averagewhile);
		
		System.out.println("Do-while loop");
		
		int sumdoWhile = 0 ;
		double averagedoWhile ;
		int lowerbounddoWhile = 1;
		int upperbounddoWhile = 100;
		do {
			sumdoWhile = lowerbounddoWhile + sumdoWhile;
			lowerbounddoWhile = lowerbounddoWhile + 1;
			}
		while (lowerbounddoWhile <= upperbounddoWhile );
		
		averagedoWhile = sumdoWhile /100 ;
		
		System.out.println("The sum of 1 to 100 is " +sumdoWhile);
		System.out.println("The average is " +averagedoWhile);
		
		
		

	}

}

	
