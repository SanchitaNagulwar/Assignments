package corejava;

import java.util.Scanner;

public class Assignment1Q5 {
	public double calculateTaxAmount(int CTC) {
		double taxAmount;
		if (CTC <= 180000) {
			taxAmount = CTC;
		}
		else if (CTC >= 181001&& CTC < 300000) {
			taxAmount= CTC-CTC*0.1;
		}
		else if (CTC>300000&& CTC<= 500000) {
			taxAmount= CTC- CTC*0.2;
		}
		else {
			taxAmount= CTC-CTC*0.3;
		}
		return taxAmount;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the CTC");
		int CTC= sc.nextInt();
		Assignment1Q5 obj= new Assignment1Q5();
		double taxAmount = obj.calculateTaxAmount(CTC);
		System.out.println("Taxable Amount:"+taxAmount);
		
		
		
		
	}

}
