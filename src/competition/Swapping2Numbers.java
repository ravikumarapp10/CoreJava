package competition;

public class Swapping2Numbers {
	public static void main(String[] args) {
		int a = 20; int b = 10;
		System.out.println("Before swapping two integers.."+a+" "+b);
		
		/*//Logic1 - using 3rd variable
		int t = a; //t = 20
		a = b;     //a = 10
		b = t;    //b = 20*/
		
		/*//Logic2 - using + & - without using 3rd variables
		a = a+b; //20+10 = 30
		b = a-b; //30-10=20
		a = a-b; //30-20=10*/
		
		/*//Logic3 - using * & / without using 3rd variables
		//also not variable should not have value zero
		
		a=a*b; //20*10=200
		b=a/b; //200/10=20
		a=a/b; //200/20=10*/	
	
		/*//Logic4 - using bitwise converter XOR (^ = caret operator)
		a=a^b; //10100 XOR/^ 1010- = 11110 = 30
		b=a^b; //30^10=20
		a=a^b; //30^20=10*/
		
		/*//Logic5 - single statement
		b = a+b-(a=b); //20+10-(10);*/
		
		
		
		System.out.println("After swapping two integers.."+a+" "+b);
	}

}
