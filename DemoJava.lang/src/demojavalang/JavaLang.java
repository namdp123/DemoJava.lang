package demojavalang;

import java.util.Scanner;
import java.lang.Math;

public class JavaLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tim so lon nhat giua 2 so
		int fristNumber, secondNumber;
		//System.out.println("PI = "+Math.PI);
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		fristNumber = scaner.nextInt();
		System.out.println("Nhap vao so thu 2: ");
		secondNumber = scaner.nextInt();
		int maxNumber = Math.max(fristNumber, secondNumber);
		System.out.println("So lon nhat trong 2 so la: "+maxNumber);
				
		//Can bac 2 mot so
		System.out.println("tinh can bac 2");
		System.out.println("Nhap so can tinh: ");
		fristNumber = scaner.nextInt();
		double sqrtFristNumber = Math.sqrt(fristNumber);
		System.out.println("Can bac 2 cua "+fristNumber +" la "+sqrtFristNumber);
	}

}
