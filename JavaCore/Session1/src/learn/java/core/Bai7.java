package learn.java.core;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu ban phim so nguyen co 4 chu so: ");
		a = sc.nextInt();
		b = (a / 1000) + (a / 100) % 10 + (a / 10) % 10 + (a % 10);
		System.out.println("Tong cac chu so cua so nguyen do la: "+b);
	}
}
