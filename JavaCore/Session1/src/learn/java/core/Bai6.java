package learn.java.core;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu ban phim so nguyen co 3 chu so: ");
		a = sc.nextInt();
		System.out.println("Chu so hang tram la: " + (a / 100));
		System.out.println("Chu so hang chuc la: " + ((a / 10)) % 10);
		System.out.println("Chu so hang don vi la: " + (a % 10));
	}
}
