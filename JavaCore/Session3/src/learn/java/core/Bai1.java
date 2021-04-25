package learn.java.core;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Nhap mang so nguyen 10 phan tu:");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]= ", i);
			a[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Mang vua nhap la:");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
	}
}
