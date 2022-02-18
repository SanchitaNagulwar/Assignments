import java.util.Scanner;

public class Assignment1Q4 {
	 public static  String declareResults( double subject1Marks,  double subject2Marks, double subject3Marks ) {
		if(subject1Marks >= 60.0 && subject2Marks>= 60.0 && subject3Marks>= 60.0) {
			return "Passed";	
		}
		else if ((subject1Marks >= 60&& subject2Marks >= 60&& subject3Marks < 60)||
				 (subject1Marks >= 60&& subject2Marks < 60&& subject3Marks >= 60)||
				 (subject1Marks < 60&& subject2Marks >= 60&& subject3Marks >= 60)){
			return "Promoted";
		}
		else {
			return "Failed";
		}	
	}
	public static void main (String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter subject1Marks");
			double subject1Marks= sc.nextDouble();
			System.out.println("Enter subject2Marks");
			double subject2Marks= sc.nextDouble();
			System.out.println("Enter subject320Marks");
			double subject3Marks= sc.nextDouble();
			
			System.out.println(declareResults(subject1Marks, subject2Marks,subject3Marks ));
		}
		
	}
	}
