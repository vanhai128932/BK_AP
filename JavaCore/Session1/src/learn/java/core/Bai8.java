package learn.java.core;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		int a;
		int[] b = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu ban phim so nguyen co 3 chu so: ");
		a = sc.nextInt();
		int tmp = a;
		for (int i = 0; i < 3; i++) {
			b[i] = tmp % 10;
			int k = tmp / 10;
			tmp = k;
		}
		System.out.print("So dao cua so do la: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(b[i]);
		}
	}
}
