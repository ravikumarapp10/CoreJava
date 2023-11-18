package competition;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Sanjeev"; String rstr = "";
		char ch;
		
//		System.out.println(str.length());

		/*//1. Using Algorithm/Logic
		for(int i = 0; i < str.length(); i++) { // 0  1  2  3  4
			ch = str.charAt(i); //R a v i 
			rstr = ch+rstr; //R aR vaR ivaR
		}
		
		//1+2 = 3, "Ravi"+"Kumar = RaviKumar
		//'R'+"" = R
		
		System.out.println(rstr);*/
		
		/*//2. Using StringBuffer class
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());*/
		
		
		//3. Using StringBuilder class
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
	}
}
