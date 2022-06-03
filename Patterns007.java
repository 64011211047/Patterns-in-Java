package Patterns;

public class Patterns007 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");			// " " 1 time
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

//		1 
//	   1 2 
//	  1 2 3 
//	 1 2 3 4 
//	1 2 3 4 5 