import java.util.*;

class ReplaceCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char old = sc.next().charAt(0);
		char newchar = sc.next().charAt(0);
		String res = "";
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==old){
				res += newchar;
			}else{
				res += s.charAt(i);
			}
		}
		System.out.println(res);
	}
}