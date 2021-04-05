package learn.java.core;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String maSinhVien, tenSinhVien, soDienThoai, email, diaChi, gioiTinh;
		int tuoi;
		System.out.println("Nhap vao thong tin sinh vien bao gom:");
		System.out.print("Ma SV    :");
		maSinhVien = sc.nextLine();
		System.out.print("Ten SV   :");
		tenSinhVien = sc.nextLine();
		System.out.print("Tuoi     :");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.print("So DT    :");
		soDienThoai = sc.nextLine();
		System.out.print("Mail     :");
		email = sc.nextLine();
		System.out.print("Dia Chi  :");
		diaChi = sc.nextLine();
		System.out.print("Gioi Tinh:");
		gioiTinh = sc.nextLine();
		System.out.println("Thong tin sinh vien vua nhap la:");
		System.out.printf("Ma SV     :%-15s", maSinhVien);
		System.out.printf("Ten SV  :%s\n", tenSinhVien);
		System.out.printf("Tuoi      :%-15d", tuoi);
		System.out.printf("So DT   :%-20s", soDienThoai);
		System.out.printf("Mail :%s\n", email);
		System.out.printf("Gioi Tinh :%-15s", gioiTinh);
		System.out.printf("Dia Chi :%s\n", diaChi);
	}
}
