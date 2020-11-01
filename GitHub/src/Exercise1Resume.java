import java.util.Scanner;
public class Exercise1Resume{

	public static void main(String[] args) {
		
		printName();
		printAge();
		printGender();
		printBirthday();
		printMaritalStatus();
		printCitizenship();
		printAddress();
		printphone();
		printGrade();
		printCGPA();
		printExperience();
		printLanguage();
		printSkills();

	}
  
	public static void printName(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter you name: ");
		String name = sc.next();
		System.out.println("Name: " + name);
				
	}
	
	public static void printAge(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();		
		System.out.println("Age: " + age);
		
	}
	
	public static void printGender(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your gender: ");
		char gender = sc.next().charAt(0);		
		System.out.println("Your gender is " + gender);
		
	}
	

	public static void printBirthday(){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Please enter day, month and year for your birthday: ");
		int day = sc.nextInt();
		String month = sc.next();
		int year = sc.nextInt();
		System.out.println("Birthday: " + day + " " + month + " " + year);
		
	}
	
	public static void printMaritalStatus(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your marital status: ");
		String status = sc.next();
		System.out.println("Marital status: " +status);
		
	}
	
	public static void printCitizenship(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your citizenship:  ");
		String citizen = sc.next();
		System.out.println("Citizenship: " +citizen);
		
	}
	
	public static void printAddress(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your address: ");
		String address = sc.nextLine();
		System.out.println("Your address is: " + address + ".");
		
	}
	
	public static void printphone(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your phone number: ");
		String phone = sc.next();
		System.out.println("Phone: " + phone);
		
	}
  
	public static void printGrade(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your STIA1113 grade: ");
		char grade = sc.next().charAt(0);		
		System.out.println("STIA1113 grade: " +grade);
		
	}
  
	public static void printCGPA(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first semester GPA: ");
		double gpa1 = sc.nextDouble();
		System.out.print("Please enter your second semester GPA: ");
		double gpa2 = sc.nextDouble();
		System.out.print("Your first and second semester GPA are " +gpa1 +" and " +gpa2 +" respectively.");
    
		double cgpa = ((gpa1+gpa2)/8.00)*4.00;    
		System.out.println("\nCGPA: " +cgpa +".");
		
	}
	
	public static void printExperience(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your (2) work experience(s): ");
		String work1 = sc.nextLine();
		String work2 = sc.nextLine();
		System.out.println("Work Experince: " +work1 +"\n\t\t" +work2);
		
	}
	
	public static void printLanguage(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter language you good at: ");
		String lang1 = sc.nextLine();
		String lang2 = sc.nextLine();
		String lang3 = sc.nextLine();
		System.out.println("Best language is 1. " +lang1 +"\n\t\t\s2. " +lang2 +"\n\t\t\s3. " +lang3 +".");
		
	}
	
	public static void printSkills(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your professional skill: ");
		String skill1 = sc.nextLine();
		String skill2 = sc.nextLine();
		String skill3 = sc.nextLine();
		System.out.println("Professional skills 1. " +skill1 +"\n\t\t\s\s\s\s2. " +skill2 +"\n\t\t\s\s\s\s3. " +skill3 +".");
	
	}
}