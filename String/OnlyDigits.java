import java.util.*;

class OnlyDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean isDigit = true;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)<'0' || s.charAt(i)>'9'){
				isDigit = false;
				break;
			}
		}
		System.out.println(isDigit);
	}
}