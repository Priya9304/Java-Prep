import java.util.*;

class RemoveSpaces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String rev = "";
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch != ' '){
			rev += ch;
			}
		}
		System.out.println(rev);
	}
}