import java.util.Scanner;

public class Assignment1Q1 {
  static boolean armstrongCheck(int n){	
	  int new_n=n;
	  int ans=0, d;
	  while(new_n!=0) {
		  d=new_n % 10;
		  ans +=d*d*d;
		  new_n/=10;
	  }
	  if (ans==n) {
		  return true;
	  }
	  else {
		  return false;
	  }
}
public static void main(String[]args) {
  Scanner sc = new Scanner(System.in);
	int n;
	
	System.out.println("Enter a three digit number");
	n=sc.nextInt();
	
	boolean ans = armstrongCheck(n);
	if (ans == true) {
		System.out.println("The number is Armstrong Number.");
	}
	else {
		System.out.println("The Number is not Armstrong Number");
	}
}
}
