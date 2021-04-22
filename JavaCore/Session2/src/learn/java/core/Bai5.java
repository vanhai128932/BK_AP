package learn.java.core;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap vao so co ba chu so: ");
//		int a = Integer.parseInt(sc.nextLine());
//		while (a < 100 || a > 999) {
//			System.out.print("Chu so can nhap phai la so co 3 chu so. Yeu cau nhap lai: ");
//			a = Integer.parseInt(sc.nextLine());
//		}
		System.out.println("Cac chu so co 3 chu so co tong cua 3 chu so la so chan la:");
		for(int i=100;i<=999;i++) {
			int tram=i/100;
			int chuc=(i%10)/10;
			int donVi=i%10;
			int tong=tram+chuc+donVi;
			if(tong%2==0)
				System.out.println(i);
		}
	}
}
