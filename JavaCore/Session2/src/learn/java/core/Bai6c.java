package learn.java.core;

public class Bai6c {
	public static void main(String[] args) {
		int m=5;
		int n=6;
		for(int i=0;i<6;i++) {
			for(int j=0;j<11;j++) {
				if(j<m || j >=n)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			m--;
			n++;
			System.out.println();
		}
	}
}
