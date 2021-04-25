package learn.java.core;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao chuoi gom cac tu cach nhau boi khoang trang: ");
		String str = sc.nextLine();
		do {
			System.out.println("***************************MENU*****************************");
			System.out.println("1. Chuyen chuoi thanh chu hoa");
			System.out.println("2. Chuyen chuoi thanh chu thuong");
			System.out.println("3. In ra so tu trong chuoi");
			System.out.println("4. Chuyen tat ca khoang trang thanh ky tu '-' ");
			System.out.println("5. Viet hoa ky tu dau tien trong moi tu");
			System.out.println("6. Thoat");
			int k = sc.nextInt();
			switch (k) {
			case 1:
				System.out.print("Chuyen chuoi thanh chu hoa: ");
				str = str.toUpperCase();
				System.out.println(str);
				break;
			case 2:
				System.out.print("Chuyen chuoi thanh chu thuong: ");
				str = str.toLowerCase();
				System.out.println(str);
				break;
			case 3:
				int count = 0;

				System.out.print("In ra so tu trong chuoi: ");
				for (int i = 0; i < str.length(); i++) {
					if (str.substring(i, i + 1).equals(" ")) {
						count++;
					}
				}
				if (count != 0) {
					System.out.println((count + 1));
				}
				break;
			case 4:
				System.out.print("Chuyen tat ca khoang trang thanh ky tu '-' : ");
				str = str.replace(' ', '-');
				System.out.println(str);
				break;
			case 5:
				System.out.println("Viet hoa ky tu dau tien trong moi tu:");

				break;
			case 6:
				System.exit(0);
			default:
				System.err.println("Lua chon khong hop le. Vui long chon tu 1-6");
				break;
			}
		} while (true);
	}
}
