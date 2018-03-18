package bai1;

	import java.util.Scanner;
	// in bang cuu chuong
	public class Cau1BCCc1 {

		public static void main(String[] args) {
			int n = 1; int i; 
			Scanner S = new Scanner(System.in);
			System.out.println("Xem BCC, Bang nhan n= ");
		    n = S.nextInt();
		    if (n <= 9)
		    {
		    	for (i=1; i<=10; i++) 
		    		System.out.println( n + "x"+ i + "=" + n*i + "\t");
		    }
		    else System.out.println("Nhap lai n=");
		}
	}

