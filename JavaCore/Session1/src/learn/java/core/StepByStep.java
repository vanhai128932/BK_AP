package learn.java.core;

import java.util.Scanner;

public class StepByStep {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao hai so nguyen a va b");
		System.out.print("a = ");
		a=Integer.parseInt(sc.nextLine());
		System.out.print("b = ");
		b=Integer.parseInt(sc.nextLine());
		System.out.println("Tong hai so nguyen a va b la: "+(a+b));
	}
}
