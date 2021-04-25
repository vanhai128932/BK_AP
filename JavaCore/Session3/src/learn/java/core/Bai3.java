package learn.java.core;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap row va col cua mang hai chieu;");
		System.out.print("row = ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("col = ");
		int m = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[n][m];
		do {
			System.out.println("***************************MENU*****************************");
			System.out.println("1. Nhap gia tri cac phan tu mang");
			System.out.println("2. Hien thi mang vua nhap theo ma tran");
			System.out.println("3. In gia tri cac phan tu nam tren duong bien");
			System.out.println("4. In gia tri va tong cac phan tu nam tren duong cheo chinh va duong cheo phu");
			System.out.println("5. Sap xep cac cot trong mang tang dan");
			System.out.println("6. Thoat");
			System.out.print("Su lua chon cua ban: ");
			int k = sc.nextInt();
			sc.nextLine();
			switch (k) {
			case 1:
				System.out.println("Nhap gia tri cac phan tu mang:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("a[%d][%d] = ", i, j);
						a[i][j] = sc.nextInt();
						sc.nextLine();
					}
				}
				break;
			case 2:
				System.out.println("Hien thi mang vua nhap theo ma tran:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", a[i][j]);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("In gia tri cac phan tu nam tren duong bien:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
							System.out.printf("%2d\t", a[i][j]);
						} else {
							System.out.printf("  \t");
						}

					}
					System.out.println();
				}

				break;
			case 4:
				if (n == m) {
					int tongDuongCheoChinh = 0;
					int tongDuongCheoPhu = 0;
					System.out.println("Cac phan tu nam tren duong cheo chinh va duong cheo phu la:");
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < m; j++) {
							if (i == j) {
								System.out.printf("%2d\t", a[i][j]);
								tongDuongCheoChinh += a[i][j];
							} else if ((i + j) == n - 1) {
								System.out.printf("%2d\t", a[i][j]);
								tongDuongCheoPhu += a[i][j];
							} else {
								System.out.printf("  \t");
							}
						}
						System.out.println();
					}
					System.out.print("Tong duong cheo chinh la: " + tongDuongCheoChinh);
					System.out.println("Tong duong cheo phu la: " + tongDuongCheoPhu);
				}

				break;
			case 5:
				System.out.println("Sap xep cac cot trong mang tang dan:");
				for (int j = 0; j < m; j++) {
					for (int i = 0; i < n - 1; i++) {
						for (int ii = i + 1; ii < n; ii++) {
							if (a[i][j] < a[ii][j]) {
								int tmp = a[i][j];
								a[i][j] = a[ii][j];
								a[ii][j] = tmp;
							}
						}
					}

				}
				System.out.println("Mang sau khi sap xep la:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", a[i][j]);
					}
					System.out.println();
				}
				break;

			case 6:
				System.exit(0);
			default:
				System.err.println("Lua chon khong hop le. Vui long chon tu 1-6.");
				break;
			}
		} while (true);
	}
}
