package learn.java.core;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Nhap vao 1 so nguyen tu ban phim: ");
		a = sc.nextInt();
		System.out.println("Binh phuong so nguyen do la: " + (a * a));
	}
}
