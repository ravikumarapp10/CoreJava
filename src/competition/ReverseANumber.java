package competition;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();		
		int rev = 0;

		/*//1. Using Algorithm/Logic
		while(num!=0) { //1234  123   12   1  0
			rev = rev * 10 + num%10; //0+1234%10=4   4*10+123%4=43   43*10+12%10=432   432*10+1%10=4320+1=4321
			num = num / 10; //1234/10=123   123/10=12   12/10=1   1/10=0
		}*/
		
		//2. Using StringBuffer class
		StringBuffer sf = new StringBuffer();
		System.out.println(sf.reverse());
		
		//3.
//		
//		System.out.println("Reverse number is: "+rev);
//		sf.append(String.valueOf(num);
		
		
	}
}