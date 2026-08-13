import java.util.*;

class CharacterTypes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int uc=0;
		int lc=0;
		int d=0;
		int sm=0;
		
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				uc++;
			}else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				lc++;
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				d++;
			}else{
				sm++;
			}
		}
		System.out.println("Uppercase "+uc);
		System.out.println("Lowercase "+lc);
		System.out.println("Digits "+d);
		System.out.println("SpecialChar "+sm);
	}
}