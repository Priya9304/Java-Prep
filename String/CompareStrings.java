import java.util.*;

class CompareStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean isEqual = true;
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Equal");
			return;
		}
		for(int i=0; i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				isEqual = false;
				break;
			}
		}
		if(isEqual) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}