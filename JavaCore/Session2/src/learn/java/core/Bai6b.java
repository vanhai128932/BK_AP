package learn.java.core;

public class Bai6b {
	public static void main(String[] args) {
		int k=6;
		for(int i=0; i<6;i++) {
			for(int j=0;j<k;j++) {
				System.out.print("$");
			}
			System.out.println();
			k--;
		}
	}
}
