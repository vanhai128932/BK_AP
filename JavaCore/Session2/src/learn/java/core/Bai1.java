package learn.java.core;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Nhap vao 4 so nguyen tu ban phim: ");
		System.out.print("a = ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("b = ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("c = ");
		c = Integer.parseInt(sc.nextLine());
		System.out.print("d = ");
		d = Integer.parseInt(sc.nextLine());
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		System.out.println("So nguyen lon nhat la: " + max);
	}
}
