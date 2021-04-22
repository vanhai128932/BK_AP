package learn.java.core;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thang, nam;
		System.out.println("Nhap vao thang va nam tu ban phim:");
		System.out.print("thang: ");
		thang = Integer.parseInt(sc.nextLine());
		System.out.print("nam: ");
		nam = Integer.parseInt(sc.nextLine());
		if (thang == 2) {
			if (nam % 4 == 0)
				System.out.println("Thang co 29 ngay.");
			else
				System.out.println("Thang co 28 ngay.");
		} else if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10)
			System.out.println("Thang co 31 ngay.");
		else
			System.out.println("Thang co 30 ngay.");
	}
}