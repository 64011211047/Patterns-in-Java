package Patterns;

public class Patterns024 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=row;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
