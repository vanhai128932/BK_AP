package learn.java.core;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		final float PI = 3.14f;
		float r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh hinh tron:");
		r = sc.nextFloat();
		System.out.println("Dien tich hinh tron la:" + (r * r * PI));
		System.out.println("Chu vi hinh tron la:" + (r * 2 * PI));
	}
}
