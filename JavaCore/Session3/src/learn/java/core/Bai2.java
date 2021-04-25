package learn.java.core;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		do {
			System.out.println("***************************MENU*****************************");
			System.out.println("1. Nhap gia tri cac phan tu mang");
			System.out.println("2. Hien thi mang vua nhap");
			System.out.println("3. In ra phan tu co gia tri lon nhat, nho nhat");
			System.out.println("4. In ra phan tu co gia tri la so nguyen to");
			System.out.println("5. In ra phan tu co gia tri la so hoan hao");
			System.out.println("6. Sap xep mang giam dan");
			System.out.println("7. Thoat");
			System.out.print("Su lua chon cua ban: ");
			int k = sc.nextInt();
			sc.nextLine();
			switch (k) {
			case 1:
				System.out.println("Nhap gia tri cac phan tu cua mang:");
				for (int i = 0; i < a.length; i++) {
					System.out.printf("a[%d] = ", i);
					a[i] = sc.nextInt();
					sc.nextLine();
				}

				break;
			case 2:
				System.out.println("Hien thi mang vua nhap: ");
				for (int i = 0; i < a.length; i++) {
					System.out.printf("%d\t", a[i]);
				}
				System.out.println();
				break;
			case 3:
				int max = a[0];
				int min = a[0];
				for (int i = 0; i < a.length; i++) {
					if (a[i] > max) {
						max = a[i];
					}
					if (a[i] < min) {
						a[i] = min;
					}
				}
				System.out.printf("Phan tu co gia tri lon nhat la: %d\n", max);
				System.out.printf("Phan tu co gia tri nho nhat la: %d\n", min);
				break;
			case 4:
				System.out.println("Cac phan tu co gia tri la so nguyen to la");
				for (int i = 0; i < a.length; i++) {
					int count = 0;
					for (int j = 1; j <= a[i]; j++) {
						if (a[i] % j == 0) {
							count++;
						}
					}
					if (count == 2) {
						System.out.printf("a[%d] = %d\t", i, a[i]);
					}
				}
				System.out.println();
				break;
			case 5:
				System.out.println("Cac phan tu co gia tri la so hoan hao la:");
				for (int i = 0; i < a.length; i++) {
					int count = 0;

					for (int j = 1; j < a[i]; j++) {
						if (a[i] % j == 0) {
							count += j;
						}

					}
					if (count == a[i]) {
						System.out.printf("a[%d] = %d\t", i, a[i]);
					}
				}
				System.out.println();
				break;
			case 6:
				System.out.println("Sap xep mang giam dan: ");
				for (int i = 0; i < a.length - 1; i++) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[i] < a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				System.out.println("Mang sau khi duoc sap xep la:");
				for (int i = 0; i < a.length; i++) {
					System.out.printf("%d\t", a[i]);
				}
				System.out.println();
				break;
			case 7:
				System.exit(0);
			default:
				System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1-7.");
				break;
			}
		} while (true);
	}
}
