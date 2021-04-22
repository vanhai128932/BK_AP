package learn.java.core;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thueBaoDienKe = 1000;
		int dinhMucSuDung = 230;
		int tienTraDinhMuc=0;
		int tienTraVuotDinhMuc=0;
		int tongTien=0;
		System.out.println("Nhap chi so cong to dien: ");
		System.out.print("Chi so cu: ");
		int chiSoCu = Integer.parseInt(sc.nextLine());
		System.out.print("Chi so moi: ");
		int chiSoMoi = Integer.parseInt(sc.nextLine());
		
		while (chiSoCu > chiSoMoi) {
			System.out.println("Chi so cu phai nho hon chi so moi. Yeu cau nhap lai.");
			System.out.print("Chi so cu: ");
			chiSoCu = Integer.parseInt(sc.nextLine());
			System.out.print("Chi so moi: ");
			chiSoMoi = Integer.parseInt(sc.nextLine());
		}
		int soDien = chiSoMoi - chiSoCu;
		tienTraDinhMuc = soDien * dinhMucSuDung;
		if (soDien <= 50) {
			tienTraVuotDinhMuc = 0;
		}
		if (51 <= soDien && soDien< 100) {
			tienTraVuotDinhMuc+=(480-dinhMucSuDung)*(soDien-50);
		}
		if (100 <= soDien && soDien< 150) {
			tienTraVuotDinhMuc+=(700-dinhMucSuDung)*(soDien-100);
		}
		if (151 <= soDien) {
			tienTraVuotDinhMuc+=(900-dinhMucSuDung)*(soDien-150);
		}
		tongTien=tienTraDinhMuc+tienTraVuotDinhMuc+thueBaoDienKe;
		System.out.println("Tien tra dinh muc la: "+tienTraDinhMuc);
		System.out.println("Tien tra vuot dinh muc la: "+tienTraVuotDinhMuc);
		System.out.println("Tong tien phai tra la: "+tongTien);
	}

}