package learn.java.core;

public class Bai6a {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println();
			k++;
		}
	}
}
