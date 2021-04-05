package learn.java.core;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tu ban phim hai so nguyen:");
		System.out.print("a = ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("b = ");
		b = Integer.parseInt(sc.nextLine());
		System.out.println("Ket qua phep cong hai so nguyen la: " + (a + b));
		System.out.println("Ket qua phep tru hai so nguyen la: " + (a - b));
		System.out.println("Ket qua phep nhan hai so nguyen la: " + (a * b));
		System.out.println("Ket qua phep chia lay nguyen hai so nguyen la: " + (a / b));
	}
}
