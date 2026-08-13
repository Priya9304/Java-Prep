import java.util.*;

class ToggleCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		for(int i=0; i< s.length(); i++){
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z'){
				ch = Character.toLowerCase(ch);
			}else if(ch>='a' && ch<='z'){
				ch = Character.toUpperCase(ch);
			}
			 result += ch;
		}
		System.out.println(result);
	}
}