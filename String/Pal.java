import java.util.*;
class Pal{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	String S = sc.nextLine();
	
	String rev = "";
	for(int i=S.length()-1;i>=0;i--){
		rev+=S.charAt(i);
	}
	if(S.equals(rev)){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not a Palindrome");
	}
}
}

