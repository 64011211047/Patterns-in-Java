package Patterns;

public class Patterns008 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=row;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

//		5 
//	   4 5 
//	  3 4 5 
//	 2 3 4 5 
//	1 2 3 4 5 