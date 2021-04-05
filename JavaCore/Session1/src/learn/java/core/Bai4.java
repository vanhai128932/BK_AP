package learn.java.core;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float diemToan, diemLy, diemHoa;
		System.out.println("Nhap vao tu ban phim:");
		System.out.print("Diem Toan :");
		diemToan = Float.parseFloat(sc.nextLine());
		System.out.print("Diem Ly   :");
		diemLy = Float.parseFloat(sc.nextLine());
		System.out.print("Diem Hoa  :");
		diemHoa = Float.parseFloat(sc.nextLine());
		System.out.println("Tong diem 3 mon la :" + (diemToan + diemLy + diemHoa));
		System.out.println(
				"Trung binh moi mon la :" + ((diemToan + diemLy + diemHoa) / 3 + (diemToan + diemLy + diemHoa) % 3));
	}
}
