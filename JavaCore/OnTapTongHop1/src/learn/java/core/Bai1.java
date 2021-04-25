package learn.java.core;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang 1 chieu a:");
		System.out.print("x = ");
		int x = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap row va col cua mang hai chieu b: ");
		System.out.print("row = ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("col = ");
		int m = sc.nextInt();
		sc.nextLine();
		String[] a = new String[x];
		int[][] b = new int[n][m];
		do {
			System.out.println("**********************MENU********************");
			System.out.println("1. Nhập giá trị các phần tử mảng a");
			System.out.println("2. Chuẩn hóa chuỗi giá trị các phần tử mảng a");
			System.out.println("3. Hiển thị giá trị các phần tử mảng a");
			System.out.println("4. Nhập giá trị các phần tử mảng b");
			System.out.println("5. Hiển thị giá trị các phần tử mảng b theo ma trận");
			System.out.println("6. Hiển thị và tính tổng các phần tử mảng b là số nguyên tố");
			System.out.println("7. Hiển thị và tính tổng các đư�?ng chéo chính, chéo phụ của mảng b nếu có");
			System.out.println("8. In ra dòng có tổng giá trị lớn nhất và nh�? nhất");
			System.out.println("9. Sắp xếp và hiển thị các dòng trong mảng b tang dần");
			System.out.println("10.Thoát");
			System.out.print("Su lua chon cua ban: ");
			int k = sc.nextInt();
			sc.nextLine();
			switch (k) {
			case 1:
				System.out.println("Nhap gia tri cac phan tu mang a:");
				for (int i = 0; i < x; i++) {
					System.out.printf("a[%d] = ", i);
					a[i] = sc.nextLine();
				}
				break;

			case 2:

				break;

			case 3:
				int ii = 0;
				for (String string : a) {
					System.out.printf("a[%d]= %s", ii, string);
				}
				System.out.println();
				break;

			case 4:
				System.out.println("Nhap gia tri cac phan tu cua mang b: ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("b[%d][%d]= ", i, j);
						b[i][j] = sc.nextInt();
						sc.nextLine();
					}
				}
				break;

			case 5:
				System.out.println("Hien thi gia tri cac phan tu mang b theo ma tran:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", b[i][j]);
					}
					System.out.println();
				}
				break;

			case 6:
				int tongNguyenTo = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						int count = 0;
						for (int z = 1; z <= b[i][j]; z++) {
							if (b[i][j] % z == 0) {
								count++;
							}
						}
						if (count == 2) {
							System.out.printf("b[%d][%d]= %d la so nguyen to.\n", i, j, b[i][j]);
							tongNguyenTo += b[i][j];
						}
					}
				}
				System.out.println("Tong cac phan tu nguyen to trong mang b la: " + tongNguyenTo);
				break;

			case 7:
				break;

			case 8:
				int tongDongMin = 0;
				int tongDongMax = 0;
				int indexMin = 0;
				int indexMax = 0;
				for (int i = 0; i < n; i++) {
					int tongDongHienTai = 0;
					for (int j = 0; j < m; j++) {
						tongDongHienTai += b[i][j];
						if (tongDongHienTai > tongDongMax) {
							tongDongMax = tongDongHienTai;
							indexMax = i;
						}
						if (tongDongHienTai < tongDongMin) {
							tongDongMin = tongDongHienTai;
							indexMin = i;
						}
					}
					System.out.printf("Tong dong thu %d = %d\n", i, tongDongHienTai);
				}
				System.out.printf("Dong %d la dong co tong lon nhat = %d\n", indexMax, tongDongMax);
				System.out.printf("Dong %d la dong co tong nho nhat = %d\n", indexMin, tongDongMin);
				break;

			case 9:
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						for (int i1 = 0; i1 < b.length - 1; i1++) {
							for (int j1 = i1 + 1; j1 < b.length; j1++) {
								if (b[i][i1] > b[i][j1]) {
									int tmp = b[i][i1];
									b[i][i1] = b[i][j1];
									b[i][j1] = tmp;
								}
							}
						}
					}
				}
				System.out.println("Mang b sau sap xep la:");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", b[i][j]);
					}
					System.out.println();
				}
				break;

			case 10:
				System.exit(0);
			default:

				System.err.println("Lua chon khong hop le. Vui long chon tu 1-10");
				break;
			}
		} while (true);
	}
}
